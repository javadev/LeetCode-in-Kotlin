package g1401_1500.s1437_check_if_all_1s_are_at_least_length_k_places_away

// #Easy #Array #2023_06_07_Time_345_ms_(66.67%)_Space_51_MB_(66.67%)

class Solution {
    fun kLengthApart(nums: IntArray, k: Int): Boolean {
        var last = -k - 1
        for (i in nums.indices) {
            if (nums[i] == 1) {
                last = if (i - last - 1 >= k) {
                    i
                } else {
                    return false
                }
            }
        }
        return true
    }
}
