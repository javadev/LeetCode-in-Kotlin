package g1001_1100.s1043_partition_array_for_maximum_sum

// #Medium #Array #Dynamic_Programming #2023_05_27_Time_194_ms_(71.43%)_Space_38.2_MB_(57.14%)

class Solution {
    fun maxSumAfterPartitioning(arr: IntArray, k: Int): Int {
        val n = arr.size
        val dp = IntArray(n)
        for (right in 0 until n) {
            var localMax = arr[right]
            for (left in right downTo (-1).coerceAtLeast(right - k) + 1) {
                localMax = localMax.coerceAtLeast(arr[left])
                if (left == 0) {
                    dp[right] = dp[right].coerceAtLeast((right + 1) * localMax)
                } else {
                    dp[right] = dp[right].coerceAtLeast(dp[left - 1] + (right - left + 1) * localMax)
                }
            }
        }
        return dp[n - 1]
    }
}
