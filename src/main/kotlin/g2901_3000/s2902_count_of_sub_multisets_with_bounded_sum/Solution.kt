package g2901_3000.s2902_count_of_sub_multisets_with_bounded_sum

// #Hard #Array #Hash_Table #Dynamic_Programming #Sliding_Window
// #2023_12_31_Time_249_ms_(100.00%)_Space_41.2_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun countSubMultisets(nums: List<Int>, l: Int, r: Int): Int {
        var r = r
        INT_MAP.clear()
        INT_MAP.add(0)
        var total = 0
        for (num in nums) {
            INT_MAP.add(num)
            total += num
        }
        if (total < l) {
            return 0
        }
        r = min(r, total)
        val cnt = IntArray(r + 1)
        cnt[0] = INT_MAP.map[0]
        var sum = 0
        for (i in 1 until INT_MAP.size) {
            val `val` = INT_MAP.vals[i]
            val count = INT_MAP.map[`val`]
            if (count > 0) {
                sum = min(r, sum + `val` * count)
                update(cnt, `val`, count, sum)
            }
        }
        var res = 0
        for (i in l..r) {
            res = (res + cnt[i]) % MOD
        }
        return res
    }

    private fun update(cnt: IntArray, n: Int, count: Int, sum: Int) {
        if (count == 1) {
            for (i in sum downTo n) {
                cnt[i] = (cnt[i] + cnt[i - n]) % MOD
            }
        } else {
            for (i in n..sum) {
                cnt[i] = (cnt[i] + cnt[i - n]) % MOD
            }
            val max = (count + 1) * n
            for (i in sum downTo max) {
                cnt[i] = (cnt[i] - cnt[i - max] + MOD) % MOD
            }
        }
    }

    private class IntMap {
        val map: IntArray = IntArray(MAX)
        val vals: IntArray = IntArray(MAX)
        var size: Int = 0

        fun add(v: Int) {
            if (map[v]++ == 0) {
                vals[size++] = v
            }
        }

        fun clear() {
            for (i in 0 until size) {
                map[vals[i]] = 0
            }
            size = 0
        }
    }

    companion object {
        private const val MOD = 1000000007
        private const val MAX = 20001
        private val INT_MAP = IntMap()
    }
}
