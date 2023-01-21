package g0501_0600.s0561_array_partition_i

// #Easy #Array #Sorting #Greedy #Counting_Sort
// #2023_01_21_Time_337_ms_(90.48%)_Space_41.1_MB_(97.62%)

import java.util.Arrays

class Solution {
    fun arrayPairSum(nums: IntArray): Int {
        Arrays.sort(nums)
        var sum = 0
        var i = 0
        while (i < nums.size - 1) {
            sum += Math.min(nums[i], nums[i + 1])
            i = i + 2
        }
        return sum
    }
}
