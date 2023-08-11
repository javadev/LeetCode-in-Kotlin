package g2401_2500.s2407_longest_increasing_subsequence_ii

// #Hard #Array #Dynamic_Programming #Divide_and_Conquer #Queue #Segment_Tree #Binary_Indexed_Tree
// #Monotonic_Queue #2023_07_03_Time_518_ms_(100.00%)_Space_56.7_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    private class SegTree(private val n: Int) {
        private val arr: IntArray = IntArray(2 * n)

        fun query(l: Int, r: Int): Int {
            var l = l
            var r = r
            l += n
            r += n
            var ans = 0
            while (l < r) {
                if (l and 1 == 1) {
                    ans = ans.coerceAtLeast(arr[l])
                    l += 1
                }
                if (r and 1 == 1) {
                    r -= 1
                    ans = ans.coerceAtLeast(arr[r])
                }
                l = l shr 1
                r = r shr 1
            }
            return ans
        }

        fun update(i: Int, `val`: Int) {
            var i = i
            i += n
            arr[i] = `val`
            while (i > 0) {
                i = i shr 1
                arr[i] = arr[2 * i].coerceAtLeast(arr[2 * i + 1])
            }
        }
    }

    fun lengthOfLIS(nums: IntArray, k: Int): Int {
        var max = 0
        for (n in nums) {
            max = max.coerceAtLeast(n)
        }
        val seg = SegTree(max)
        var ans = 0
        var i = 0
        while (i < nums.size) {
            var n = nums[i]
            n -= 1
            val temp = seg.query(0.coerceAtLeast(n - k), n) + 1
            ans = ans.coerceAtLeast(temp)
            seg.update(n, temp)
            i++
        }
        return ans
    }
}
