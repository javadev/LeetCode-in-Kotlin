package g1001_1100.s1049_last_stone_weight_ii

// #Medium #Array #Dynamic_Programming #2023_05_29_Time_150_ms_(100.00%)_Space_35.5_MB_(100.00%)

class Solution {
    fun lastStoneWeightII(stones: IntArray): Int {
        // dp[i][j] i is the index of stones, j is the current weight
        // goal is to find max closest to half and use it to get the diff
        // 0-1 knapsack problem
        var sum = 0
        for (stone in stones) {
            sum += stone
        }
        val half = sum / 2
        val dp = IntArray(half + 1)
        for (cur in stones) {
            for (j in half downTo cur) {
                dp[j] = dp[j].coerceAtLeast(dp[j - cur] + cur)
            }
        }
        return sum - dp[half] * 2
    }
}
