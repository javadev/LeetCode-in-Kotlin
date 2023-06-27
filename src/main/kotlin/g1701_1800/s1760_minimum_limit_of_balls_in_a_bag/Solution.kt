package g1701_1800.s1760_minimum_limit_of_balls_in_a_bag

// #Medium #Array #Binary_Search #Binary_Search_II_Day_3
// #2023_06_18_Time_460_ms_(100.00%)_Space_54.6_MB_(100.00%)

class Solution {
    fun minimumSize(nums: IntArray, maxOperations: Int): Int {
        var left = 1
        var right = 1000000000
        while (left < right) {
            val mid = left + (right - left) / 2
            if (operations(nums, mid) > maxOperations) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return left
    }

    private fun operations(nums: IntArray, mid: Int): Int {
        var operations = 0
        for (num in nums) {
            operations += (num - 1) / mid
        }
        return operations
    }
}
