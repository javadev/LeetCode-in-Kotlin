package g3701_3800.s3702_longest_subsequence_with_non_zero_bitwise_xor

// #Medium #Weekly_Contest_470 #2025_10_06_Time_2_ms_(100.00%)_Space_79.41_MB_(83.33%)

class Solution {
    fun longestSubsequence(nums: IntArray): Int {
        var xorSum = 0
        var allZero = true
        for (num in nums) {
            xorSum = xorSum xor num
            if (num != 0) {
                allZero = false
            }
        }
        if (allZero) {
            return 0
        }
        return if (xorSum != 0) nums.size else nums.size - 1
    }
}
