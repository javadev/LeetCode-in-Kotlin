package g2001_2100.s2023_number_of_pairs_of_strings_with_concatenation_equal_to_target

// #Medium #Array #String #2023_06_23_Time_228_ms_(40.00%)_Space_37.1_MB_(80.00%)

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
