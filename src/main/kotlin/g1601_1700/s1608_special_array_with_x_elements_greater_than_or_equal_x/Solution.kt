package g1601_1700.s1608_special_array_with_x_elements_greater_than_or_equal_x

// #Easy #Array #Sorting #Binary_Search #Binary_Search_I_Day_7
// #2023_06_15_Time_147_ms_(81.82%)_Space_34.3_MB_(81.82%)

class Solution {
    fun specialArray(nums: IntArray): Int {
        nums.sort()
        val max = nums[nums.size - 1]
        for (x in 1..max) {
            var found = 0
            var i = nums.size - 1
            while (i >= 0 && nums[i] >= x) {
                i--
                found++
            }
            if (found == x) {
                return x
            }
        }
        return -1
    }
}
