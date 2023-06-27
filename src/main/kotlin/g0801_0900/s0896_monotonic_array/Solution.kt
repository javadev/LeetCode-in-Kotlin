package g0801_0900.s0896_monotonic_array

// #Easy #Array #Programming_Skills_II_Day_1 #2023_04_12_Time_576_ms_(90.91%)_Space_55.5_MB_(95.45%)

class Solution {
    fun isMonotonic(nums: IntArray): Boolean {
        var i = 0
        while (i < nums.size - 1) {
            if (nums[i] > nums[i + 1]) {
                break
            }
            i++
        }
        if (i == nums.size - 1) {
            return true
        }
        i = 0
        while (i < nums.size - 1) {
            if (nums[i] < nums[i + 1]) {
                break
            }
            i++
        }
        return i == nums.size - 1
    }
}
