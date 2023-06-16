package g1701_1800.s1752_check_if_array_is_sorted_and_rotated

// #Easy #Array
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
