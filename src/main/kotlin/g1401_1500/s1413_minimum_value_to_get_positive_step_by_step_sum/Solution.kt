package g1401_1500.s1413_minimum_value_to_get_positive_step_by_step_sum

// #Easy #Array #Prefix_Sum
class Solution {
    fun minStartValue(nums: IntArray): Int {
        var min = Int.MAX_VALUE
        var sum = 0
        for (num in nums) {
            sum += num
            min = Math.min(sum, min)
        }
        return if (min > 0) 1 else Math.abs(min) + 1
    }
}
