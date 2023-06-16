package g1701_1800.s1703_minimum_adjacent_swaps_for_k_consecutive_ones

// #Hard #Array #Greedy #Prefix_Sum #Sliding_Window
// #2023_06_15_Time_518_ms_(100.00%)_Space_52.2_MB_(100.00%)

class Solution {
    fun minMoves(nums: IntArray, k: Int): Int {
        val len = nums.size
        var cnt = 0
        var min = Long.MAX_VALUE
        for (num in nums) {
            if (num == 1) {
                cnt++
            }
        }
        val arr = IntArray(cnt)
        var idx = 0
        val sum = LongArray(cnt + 1)
        for (i in 0 until len) {
            if (nums[i] == 1) {
                arr[idx++] = i
                sum[idx] = sum[idx - 1] + i
            }
        }
        var i = 0
        while (i + k - 1 < cnt) {
            min = Math.min(min, getSum(arr, i, i + k - 1, sum))
            i++
        }
        return min.toInt()
    }

    private fun getSum(arr: IntArray, l: Int, h: Int, sum: LongArray): Long {
        val mid = l + (h - l) / 2
        val k = h - l + 1
        val radius = mid - l
        var res = sum[h + 1] - sum[mid + 1] - (sum[mid] - sum[l]) - (1 + radius) * radius
        if (k % 2 == 0) {
            res = res - arr[mid] - (radius + 1)
        }
        return res
    }
}
