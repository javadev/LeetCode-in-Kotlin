package g1801_1900.s1883_minimum_skips_to_arrive_at_meeting_on_time

// #Hard #Array #Dynamic_Programming
class Solution {
    fun minSkips(dist: IntArray, speed: Int, hoursBefore: Int): Int {
        val len = dist.size
        // dp[i][j] finish ith road, skip j times;
        val dp = Array(len) { IntArray(len) }
        dp[0][0] = dist[0]
        for (i in 1 until len) {
            dp[i][0] = (dp[i - 1][0] + speed - 1) / speed * speed + dist[i]
        }
        for (i in 1 until len) {
            for (j in 0..i) {
                if (j > 0) {
                    dp[i][j] = dp[i - 1][j - 1] + dist[i]
                }
                if (j <= i - 1) {
                    dp[i][j] = Math.min(
                        dp[i][j], (dp[i - 1][j] + speed - 1) / speed * speed + dist[i]
                    )
                }
            }
        }
        for (i in 0 until len) {
            if (dp[len - 1][i] <= speed.toLong() * hoursBefore) {
                return i
            }
        }
        return -1
    }
}
