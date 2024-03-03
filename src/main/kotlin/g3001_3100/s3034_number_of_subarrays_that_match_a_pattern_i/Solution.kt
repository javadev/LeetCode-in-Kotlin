package g3001_3100.s3034_number_of_subarrays_that_match_a_pattern_i

// #Medium #Array #Hash_Function #String_Matching #Rolling_Hash
// #2024_03_03_Time_225_ms_(38.09%)_Space_39_MB_(59.52%)

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
