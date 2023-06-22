package g2001_2100.s2023_number_of_pairs_of_strings_with_concatenation_equal_to_target

// #Medium #Array #String
class Solution {
    fun numOfPairs(nums: Array<String>, target: String): Int {
        var ans = 0
        for (i in nums.indices) {
            for (j in nums.indices) {
                if (i != j) {
                    val con = nums[i] + nums[j]
                    if (con == target) {
                        ans++
                    }
                }
            }
        }
        return ans
    }
}
