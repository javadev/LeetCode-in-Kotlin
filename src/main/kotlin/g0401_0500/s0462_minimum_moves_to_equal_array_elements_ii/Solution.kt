package g0401_0500.s0462_minimum_moves_to_equal_array_elements_ii

// #Medium #Array #Math #Sorting #2022_12_28_Time_210_ms_(100.00%)_Space_38.1_MB_(87.50%)

import java.util.Arrays

class Solution {
    fun minMoves2(nums: IntArray): Int {
        Arrays.sort(nums)
        val median = (nums.size - 1) / 2
        var ops = 0
        for (num in nums) {
            if (num != nums[median]) {
                ops += Math.abs(nums[median] - num)
            }
        }
        return ops
    }
}
