package g3601_3700.s3627_maximum_median_sum_of_subsequences_of_size_3

// #Medium #Weekly_Contest_460 #2025_07_27_Time_46_ms_(91.67%)_Space_133.87_MB_(16.67%)

class Solution {
    fun maximumMedianSum(nums: IntArray): Long {
        nums.sort()
        var i = 0
        var j = nums.size
        var sum = 0L
        while (i < j) {
            sum += nums[j - 2]
            j = j - 2
            i++
        }
        return sum
    }
}
