package g2201_2300.s2221_find_triangular_sum_of_an_array

// #Medium #Array #Math #Simulation #Combinatorics
// #2023_06_27_Time_257_ms_(100.00%)_Space_43.2_MB_(100.00%)

class Solution {
    fun triangularSum(nums: IntArray): Int {
        var len = nums.size
        while (len-- > 1) {
            for (i in 0 until len) {
                nums[i] += nums[i + 1]
                nums[i] %= 10
            }
        }
        return nums[0]
    }
}
