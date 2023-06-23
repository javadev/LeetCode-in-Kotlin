package g2001_2100.s2016_maximum_difference_between_increasing_elements

// #Easy #Array #2023_06_23_Time_140_ms_(100.00%)_Space_35_MB_(100.00%)

class Solution {
    fun maximumDifference(nums: IntArray): Int {
        var mini = nums[0]
        var ans = -1
        for (i in 0 until nums.size - 1) {
            if (nums[i] < mini) {
                mini = nums[i]
            }
            if (nums[i + 1] - mini > ans) {
                ans = nums[i + 1] - mini
            }
        }
        return if (ans <= 0) -1 else ans
    }
}
