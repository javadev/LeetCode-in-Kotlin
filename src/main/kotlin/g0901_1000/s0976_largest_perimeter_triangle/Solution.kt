package g0901_1000.s0976_largest_perimeter_triangle

// #Easy #Array #Math #Sorting #Greedy #Programming_Skills_I_Day_3_Conditional_Statements
// #2023_05_08_Time_304_ms_(33.33%)_Space_58.4_MB_(10.00%)

class Solution {
    fun largestPerimeter(nums: IntArray): Int {
        nums.sort()       
        for (i in nums.size - 1 downTo 2) {
            if (nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2]
            }
        }
        return 0
    }
}
