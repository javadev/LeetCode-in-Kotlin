package g3001_3100.s3036_number_of_subarrays_that_match_a_pattern_ii

// #Hard #Array #Hash_Function #String_Matching #Rolling_Hash
// #2024_03_01_Time_5_ms_(98.27%)_Space_172.1_MB_(75.77%)

class Solution {
    fun countMatchingSubarrays(nums: IntArray, pattern: IntArray): Int {
        val n = nums.size
        val m = pattern.size
        val arr = IntArray(n - 1)
        for (i in 0 until n - 1) {
            if (nums[i + 1] > nums[i]) {
                arr[i] = 1
            } else if (nums[i + 1] < nums[i]) {
                arr[i] = -1
            }
        }
        var hash = 0
        var pHash = 0
        var base = 1
        for (i in 0 until m) {
            hash = hash * 3 + arr[i] + 1
            pHash = pHash * 3 + pattern[i] + 1
            base *= 3
        }
        var count = 0
        for (i in 0..n - 1 - m) {
            if (hash == pHash) {
                count++
            }

            if (i < n - 1 - m) {
                hash = hash * 3 - base * (arr[i] + 1) + arr[i + m] + 1
            }
        }
        return count
    }
}
