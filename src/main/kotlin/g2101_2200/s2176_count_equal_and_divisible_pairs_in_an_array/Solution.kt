package g2101_2200.s2176_count_equal_and_divisible_pairs_in_an_array

// #Easy #Array
class Solution {
    fun countPairs(nums: IntArray, k: Int): Int {
        var ans = 0
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] == nums[j] && i * j % k == 0) {
                    ++ans
                }
            }
        }
        return ans
    }
}
