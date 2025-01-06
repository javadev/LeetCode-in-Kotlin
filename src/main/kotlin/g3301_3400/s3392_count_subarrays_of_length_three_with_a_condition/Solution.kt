package g3301_3400.s3392_count_subarrays_of_length_three_with_a_condition

// #Easy #Array #2024_12_22_Time_3_ms_(100.00%)_Space_45_MB_(100.00%)

class Solution {
    fun countSubarrays(nums: IntArray): Int {
        val window = 3
        var cnt = 0
        for (i in 0..nums.size - window) {
            val first = nums[i].toFloat()
            val second = nums[i + 1].toFloat()
            val third = nums[i + 2].toFloat()
            if (second / 2 == first + third) {
                cnt++
            }
        }
        return cnt
    }
}
