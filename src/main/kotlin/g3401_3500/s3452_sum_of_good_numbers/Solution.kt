package g3401_3500.s3452_sum_of_good_numbers

// #Easy #Array #2025_02_18_Time_1_ms_(100.00%)_Space_38.08_MB_(84.85%)

class Solution {
    fun sumOfGoodNumbers(nums: IntArray, k: Int): Int {
        var totalSum = 0
        val n = nums.size
        for (i in 0..<n) {
            var isGood = true
            if (i - k >= 0 && nums[i] <= nums[i - k]) {
                isGood = false
            }
            if (i + k < n && nums[i] <= nums[i + k]) {
                isGood = false
            }
            if (isGood) {
                totalSum += nums[i]
            }
        }
        return totalSum
    }
}
