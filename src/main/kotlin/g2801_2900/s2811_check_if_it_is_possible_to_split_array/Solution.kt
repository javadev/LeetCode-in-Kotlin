package g2801_2900.s2811_check_if_it_is_possible_to_split_array

// #Medium #Array #Dynamic_Programming #Greedy
// #2023_12_06_Time_180_ms_(100.00%)_Space_36.1_MB_(100.00%)

class Solution {
    fun canSplitArray(nums: List<Int>, m: Int): Boolean {
        if (nums.size < 3 && !nums.isEmpty()) {
            return true
        }
        var ans = false
        for (i in 0 until nums.size - 1) {
            if (nums[i] + nums[i + 1] >= m) {
                ans = true
            }
        }
        return ans
    }
}
