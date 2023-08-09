package g2701_2800.s2778_sum_of_squares_of_special_elements

// #Easy #Array #Simulation #2023_08_09_Time_183_ms_(86.44%)_Space_36.9_MB_(84.75%)

class Solution {
    fun sumOfSquares(nums: IntArray): Int {
        var sum = 0
        for (i in nums.indices) {
            if (nums.size % (i + 1) == 0) sum += nums[i] * nums[i]
        }
        return sum
    }
}
