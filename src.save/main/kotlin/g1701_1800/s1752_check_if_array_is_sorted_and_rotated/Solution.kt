package g1701_1800.s1752_check_if_array_is_sorted_and_rotated

// #Easy #Array #2023_06_18_Time_133_ms_(85.71%)_Space_33.3_MB_(100.00%)

class Solution {
    fun check(nums: IntArray): Boolean {
        var checker = 0
        for (i in 1 until nums.size) {
            if (nums[i - 1] > nums[i]) {
                checker++
            }
        }
        // checking if the last element is greater than the first
        if (nums[nums.size - 1] > nums[0]) {
            checker++
        }
        return checker <= 1
    }
}
