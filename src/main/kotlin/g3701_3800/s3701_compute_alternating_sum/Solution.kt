package g3701_3800.s3701_compute_alternating_sum

// #Easy #Array #Simulation #Weekly_Contest_470
// #2025_10_06_Time_1_ms_(100.00%)_Space_47.16_MB_(11.11%)

class Solution {
    fun alternatingSum(nums: IntArray): Int {
        var sum = 0
        for (i in nums.indices) {
            val num = nums[i]
            if (i % 2 == 0) {
                sum += num
            } else {
                sum -= num
            }
        }
        return sum
    }
}
