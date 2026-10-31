package g3701_3800.s3791_number_of_balanced_integers_in_a_range

// #Hard #Dynamic_Programming #Principal #Weekly_Contest_482
// #2026_05_22_Time_75_ms_(83.12%)_Space_46.63_MB_(70.13%)

class Solution {
    private fun solve(number: String, idx: Int, diff: Int, tight: Int, dp: Array<Array<LongArray>>): Long {
        if (idx == number.length) {
            return (if (diff == 0) 1 else 0).toLong()
        }
        if (dp[idx][diff + dp[0].size / 2][tight] != -1L) {
            return dp[idx][diff + dp[0].size / 2][tight]
        }
        var ans: Long = 0
        val ub = if (tight == 1) number.get(idx).code - '0'.code else 9
        for (i in 0..ub) {
            val newTight = if (tight == 1 && i == ub) 1 else 0
            if (idx % 2 == 0) {
                ans += solve(number, idx + 1, diff - i, newTight, dp)
            } else {
                ans += solve(number, idx + 1, diff + i, newTight, dp)
            }
        }
        dp[idx][diff + dp[0].size / 2][tight] = ans
        return dp[idx][diff + dp[0].size / 2][tight]
    }

    private fun solve(num: Long): Long {
        if (num == 0L) {
            return 1
        }
        val number = num.toString()
        val len = number.length
        val dp: Array<Array<LongArray>> =
            if (len % 2 ==
                1
            ) {
                Array<Array<LongArray>>(len) { Array<LongArray>((len + 1) * 9 + 1) { LongArray(2) } }
            } else {
                Array<Array<LongArray>>(
                    len,
                ) { Array<LongArray>(len * 9 + 1) { LongArray(2) } }
            }
        for (tbl in dp) {
            for (row in tbl) {
                row.fill(-1)
            }
        }
        return solve(number, 0, 0, 1, dp)
    }

    fun countBalanced(low: Long, high: Long): Long = solve(high) - solve(low - 1)
}
