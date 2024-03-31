package g3001_3100.s3065_minimum_operations_to_exceed_threshold_value_i

// #Easy #Array #2024_03_31_Time_180_ms_(71.76%)_Space_36.9_MB_(81.18%)

class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {
        var count = 0
        for (num in nums) {
            if (num >= k) {
                count++
            }
        }
        return nums.size - count
    }
}
