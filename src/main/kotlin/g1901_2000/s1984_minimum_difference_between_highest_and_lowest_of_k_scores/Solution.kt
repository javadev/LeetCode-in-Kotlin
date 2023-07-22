package g1901_2000.s1984_minimum_difference_between_highest_and_lowest_of_k_scores

// #Easy #Array #Sorting #Sliding_Window #2023_06_21_Time_227_ms_(83.33%)_Space_39.2_MB_(91.67%)

class Solution {
    fun minimumDifference(nums: IntArray, k: Int): Int {
        nums.sort()
        var minDiff = nums[nums.size - 1]
        for (i in 0..nums.size - k) {
            minDiff = Math.min(minDiff, nums[i + k - 1] - nums[i])
        }
        return minDiff
    }
}
