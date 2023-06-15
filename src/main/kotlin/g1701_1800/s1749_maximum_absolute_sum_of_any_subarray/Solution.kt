package g1701_1800.s1749_maximum_absolute_sum_of_any_subarray

// #Medium #Array #Dynamic_Programming
class Solution {
    fun maxAbsoluteSum(nums: IntArray): Int {
        var min: Int = 0
        var max: Int = 0
        var s: Int = 0
        for (num: Int in nums) {
            s += num
            min = Math.min(min, s)
            max = Math.max(max, s)
        }
        return max - min
    }
}
