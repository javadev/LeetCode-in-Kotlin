package g0201_0300.s0209_minimum_size_subarray_sum

// #Medium #Array #Binary_Search #Prefix_Sum #Sliding_Window #Algorithm_II_Day_5_Sliding_Window
// #Binary_Search_II_Day_1 #2022_10_20_Time_315_ms_(96.73%)_Space_46.7_MB_(90.20%)

class Solution {
    fun minSubArrayLen(s: Int, nums: IntArray): Int {
        var sum = 0
        var start = 0
        var minLength = Integer.MAX_VALUE
        var end = 0
        if (nums.size < 1) {
            return 0
        }
        while (end < nums.size) {
            sum += nums[end]
            while (sum >= s) {
                minLength = Math.min(minLength, end - start + 1)
                sum -= nums[start++]
            }
            end++
        }
        return if (start > 0) minLength else 0
    }
}
