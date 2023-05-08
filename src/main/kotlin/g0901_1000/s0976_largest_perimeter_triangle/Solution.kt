package g0901_1000.s0976_largest_perimeter_triangle

// #Easy #Array #Math #Sorting #Greedy #Programming_Skills_I_Day_3_Conditional_Statements
// #2023_05_08_Time_367_ms_(6.67%)_Space_59.3_MB_(10.00%)

import java.util.Arrays

class Solution {
    fun largestPerimeter(nums: IntArray): Int {
        val n = nums.size
        Arrays.sort(nums)
        for (i in n - 1 downTo 2) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2]
            }
        }
        return 0
    }
}
