package g3701_3800.s3721_longest_balanced_subarray_ii

// #Hard #Array #Hash_Table #Prefix_Sum #Divide_and_Conquer #Segment_Tree #Weekly_Contest_472
// #2025_10_22_Time_217_ms_(100.00%)_Space_85.54_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    private class Segtree(n: Int) {
        var minsegtree: IntArray = IntArray(4 * n)
        var maxsegtree: IntArray = IntArray(4 * n)
        var lazysegtree: IntArray = IntArray(4 * n)

        fun applyLazy(ind: Int, lo: Int, hi: Int, `val`: Int) {
            minsegtree[ind] += `val`
            maxsegtree[ind] += `val`
            if (lo != hi) {
                lazysegtree[2 * ind + 1] += `val`
                lazysegtree[2 * ind + 2] += `val`
            }
            lazysegtree[ind] = 0
        }

        fun find(ind: Int, lo: Int, hi: Int, l: Int, r: Int): Int {
            if (lazysegtree[ind] != 0) {
                applyLazy(ind, lo, hi, lazysegtree[ind])
            }
            if (hi < l || lo > r) {
                return -1
            }
            if (minsegtree[ind] > 0 || maxsegtree[ind] < 0) {
                return -1
            }
            if (lo == hi) {
                return if (minsegtree[ind] == 0) lo else -1
            }
            val mid = (lo + hi) / 2
            val ans1 = find(2 * ind + 1, lo, mid, l, r)
            if (ans1 != -1) {
                return ans1
            }
            return find(2 * ind + 2, mid + 1, hi, l, r)
        }

        fun update(ind: Int, lo: Int, hi: Int, l: Int, r: Int, `val`: Int) {
            if (lazysegtree[ind] != 0) {
                applyLazy(ind, lo, hi, lazysegtree[ind])
            }
            if (hi < l || lo > r) {
                return
            }
            if (lo >= l && hi <= r) {
                applyLazy(ind, lo, hi, `val`)
                return
            }
            val mid = (lo + hi) / 2
            update(2 * ind + 1, lo, mid, l, r, `val`)
            update(2 * ind + 2, mid + 1, hi, l, r, `val`)
            minsegtree[ind] = min(minsegtree[2 * ind + 1], minsegtree[2 * ind + 2])
            maxsegtree[ind] = max(maxsegtree[2 * ind + 1], maxsegtree[2 * ind + 2])
        }
    }

    fun longestBalanced(nums: IntArray): Int {
        val n = nums.size
        val mp: MutableMap<Int, Int> = HashMap()
        val seg = Segtree(n)
        var ans = 0
        for (i in 0..<n) {
            val x = nums[i]
            var prev = -1
            if (mp.containsKey(x)) {
                prev = mp[x]!!
            }
            val change = if (x % 2 == 0) -1 else 1
            seg.update(0, 0, n - 1, prev + 1, i, change)
            val temp = seg.find(0, 0, n - 1, 0, i)
            if (temp != -1) {
                ans = max(ans, i - temp + 1)
            }
            mp[x] = i
        }
        return ans
    }
}
