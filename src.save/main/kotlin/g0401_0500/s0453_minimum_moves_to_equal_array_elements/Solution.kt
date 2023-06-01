package g0401_0500.s0453_minimum_moves_to_equal_array_elements

// #Medium #Array #Math #2022_12_25_Time_282_ms_(100.00%)_Space_38.7_MB_(88.89%)

class Solution {
    fun minMoves(nums: IntArray): Int {
        var min = nums[0]
        var sum = nums[0]
        // determining the total sum and smallest element of the input array
        for (i in 1..nums.size - 1) {
            sum += nums[i]
            min = Math.min(min, nums[i])
        }
        return sum - min * nums.size
    }
}
