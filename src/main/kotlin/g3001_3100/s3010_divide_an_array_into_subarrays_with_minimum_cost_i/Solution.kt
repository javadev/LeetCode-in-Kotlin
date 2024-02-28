package g3001_3100.s3010_divide_an_array_into_subarrays_with_minimum_cost_i

// #Easy #Array #Sorting #Enumeration #2024_02_28_Time_170_ms_(94.23%)_Space_37.3_MB_(71.15%)

class Solution {
    fun minimumCost(nums: IntArray): Int {
        val first = nums[0]
        var min = 51
        var secMin = 52
        for (i in 1 until nums.size) {
            if (nums[i] < min) {
                secMin = min
                min = nums[i]
            } else if (nums[i] < secMin) {
                secMin = nums[i]
            }
        }
        return first + min + secMin
    }
}
