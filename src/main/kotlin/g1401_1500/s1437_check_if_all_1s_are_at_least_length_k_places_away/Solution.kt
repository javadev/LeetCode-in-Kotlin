package g1401_1500.s1437_check_if_all_1s_are_at_least_length_k_places_away

// #Easy #Array
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
