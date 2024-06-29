package g3101_3200.s3190_find_minimum_operations_to_make_all_elements_divisible_by_three

// #Easy #Array #Math #2024_06_29_Time_153_ms_(87.95%)_Space_34.7_MB_(74.70%)

class Solution {
    fun minimumOperations(nums: IntArray): Int {
        var count = 0
        for (i in nums.indices) {
            if (nums[i] % 3 != 0) {
                count++
            }
        }
        return count
    }
}
