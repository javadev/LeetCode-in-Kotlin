package g3501_3600.s3578_count_partitions_with_max_min_difference_at_most_k

// #Medium #2025_06_08_Time_25_ms_(100.00%)_Space_65.21_MB_(100.00%)

class Solution {
    fun countPartitions(nums: IntArray, k: Int): Int {
        val n = nums.size
        val dp = IntArray(n + 1)
        dp[0] = 1
        val prefix = IntArray(n + 1)
        prefix[0] = 1
        val maxDeque = IntArray(n)
        var maxFront = 0
        var maxBack = 0
        val minDeque = IntArray(n)
        var minFront = 0
        var minBack = 0
        var start = 0
        for (end in 0..<n) {
            while (maxBack > maxFront && nums[maxDeque[maxBack - 1]] <= nums[end]) {
                maxBack--
            }
            maxDeque[maxBack++] = end
            while (minBack > minFront && nums[minDeque[minBack - 1]] >= nums[end]) {
                minBack--
            }
            minDeque[minBack++] = end
            while (nums[maxDeque[maxFront]] - nums[minDeque[minFront]] > k) {
                if (maxDeque[maxFront] == start) {
                    maxFront++
                }
                if (minDeque[minFront] == start) {
                    minFront++
                }
                start++
            }
            var sum = prefix[end] - (if (start > 0) prefix[start - 1] else 0)
            if (sum < 0) {
                sum += MOD
            }
            dp[end + 1] = sum % MOD
            prefix[end + 1] = (prefix[end] + dp[end + 1]) % MOD
        }
        return dp[n]
    }

    companion object {
        private const val MOD = 1000000007
    }
}
