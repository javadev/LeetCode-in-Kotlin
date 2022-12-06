package g0401_0500.s0413_arithmetic_slices

// #Medium #Array #Dynamic_Programming #Algorithm_II_Day_14_Dynamic_Programming
// #Dynamic_Programming_I_Day_10 #2022_12_03_Time_156_ms_(100.00%)_Space_36_MB_(41.03%)

class Solution {
    fun numberOfArithmeticSlices(nums: IntArray): Int {
        var sum = 0
        var curr = 0
        for (i in 2 until nums.size) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                curr++
                sum += curr
            } else {
                curr = 0
            }
        }
        return sum
    }
}
