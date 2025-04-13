package g1001_1100.s1004_max_consecutive_ones_iii

// #Medium #Array #Binary_Search #Prefix_Sum #Sliding_Window #LeetCode_75_Sliding_Window
// #2023_05_14_Time_318_ms_(30.95%)_Space_84.7_MB_(8.33%)

class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var onesCount = 0
        var max = 0
        var start = 0
        for (end in nums.indices) {
            if (nums[end] == 1) {
                onesCount++
            }
            if (end - start + 1 > onesCount + k) {
                if (nums[start] == 1) {
                    onesCount--
                }
                start++
            }
            max = max.coerceAtLeast(end - start + 1)
        }
        return max
    }
}
