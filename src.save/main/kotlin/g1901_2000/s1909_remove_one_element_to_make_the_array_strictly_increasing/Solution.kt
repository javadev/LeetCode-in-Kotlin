package g1901_2000.s1909_remove_one_element_to_make_the_array_strictly_increasing

// #Easy #Array #2023_06_19_Time_176_ms_(50.00%)_Space_36.3_MB_(50.00%)

class Solution {
    fun canBeIncreasing(nums: IntArray): Boolean {
        var removed = false
        for (i in 1 until nums.size) {
            if (nums[i] <= nums[i - 1]) {
                removed = if (removed) {
                    return false
                } else {
                    true
                }
                if (i > 1 && nums[i] <= nums[i - 2]) {
                    nums[i] = nums[i - 1]
                }
            }
        }
        return true
    }
}
