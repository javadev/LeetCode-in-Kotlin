package g1501_1600.s1509_minimum_difference_between_largest_and_smallest_value_in_three_moves

// #Medium #Array #Sorting #Greedy
class Solution {
    fun minDifference(nums: IntArray): Int {
        nums.sort()
        val n = nums.size
        var res = Int.MAX_VALUE
        if (n < 4) {
            return 0
        }
        res = Math.min(res, nums[n - 4] - nums[0])
        res = Math.min(res, nums[n - 3] - nums[1])
        res = Math.min(res, nums[n - 2] - nums[2])
        res = Math.min(res, nums[n - 1] - nums[3])
        return res
    }
}
