package g3001_3100.s3034_number_of_subarrays_that_match_a_pattern_i

// #Medium #Array #Hash_Function #String_Matching #Rolling_Hash
// #2024_03_01_Time_1_ms_(100.00%)_Space_43.9_MB_(97.20%)

class Solution {
    fun countMatchingSubarrays(nums: IntArray, pattern: IntArray): Int {
        val n = nums.size
        val m = pattern.size
        var count = 0
        for (i in 0..n - m - 1) {
            var k = 0
            while (k < m) {
                if (nums[i + k + 1] > nums[i + k] && pattern[k] == 1) {
                    k++
                } else if (nums[i + k + 1] == nums[i + k] && pattern[k] == 0) {
                    k++
                } else if (nums[i + k + 1] < nums[i + k] && pattern[k] == -1) {
                    k++
                } else {
                    break
                }
            }
            if (k == m) {
                count++
            }
        }
        return count
    }
}
