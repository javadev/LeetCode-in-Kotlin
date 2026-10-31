package g3701_3800.s3753_total_waviness_of_numbers_in_range_ii

// #Hard #Dynamic_Programming #Math #Senior_Staff #Biweekly_Contest_170
// #2026_04_26_Time_52_ms_(96.83%)_Space_46.46_MB_(98.41%)

class Solution {
    private class Pair(var count: Long, var sum: Long)

    private lateinit var digits: CharArray
    private lateinit var memo: Array<Array<Array<Array<Array<Pair?>>>>>
    private lateinit var seen: Array<Array<Array<Array<BooleanArray>>>> // Changed innermost to BooleanArray

    fun totalWaviness(num1: Long, num2: Long): Long = solve(num2) - solve(num1 - 1)

    private fun solve(x: Long): Long {
        if (x <= 0) {
            return 0
        }
        digits = x.toString().toCharArray()
        val n = digits.size
        memo = Array(n) { Array(2) { Array(2) { Array(11) { arrayOfNulls<Pair>(11) } } } }
        seen = Array(n) { Array(2) { Array(2) { Array(11) { BooleanArray(11) } } } }
        return dfs(0, 1, 0, 10, 10).sum
    }

    private fun dfs(pos: Int, tight: Int, started: Int, prev2: Int, prev1: Int): Pair {
        if (pos == digits.size) {
            return Pair(1, 0)
        }
        if (seen[pos][tight][started][prev2][prev1]) {
            return memo[pos][tight][started][prev2][prev1]!!
        }
        seen[pos][tight][started][prev2][prev1] = true

        val limit = if (tight == 1) digits[pos] - '0' else 9
        var totalCount = 0L
        var totalSum = 0L

        for (d in 0..limit) {
            val nextTight = if (tight == 1 && d == limit) 1 else 0
            when {
                started == 0 && d == 0 -> {
                    val nxt = dfs(pos + 1, nextTight, 0, 10, 10)
                    totalCount += nxt.count
                    totalSum += nxt.sum
                }

                started == 0 -> {
                    val nxt = dfs(pos + 1, nextTight, 1, 10, d)
                    totalCount += nxt.count
                    totalSum += nxt.sum
                }

                prev2 == 10 -> {
                    val nxt = dfs(pos + 1, nextTight, 1, prev1, d)
                    totalCount += nxt.count
                    totalSum += nxt.sum
                }

                else -> {
                    var add = 0
                    if ((prev1 > prev2 && prev1 > d) || (prev1 < prev2 && prev1 < d)) {
                        add = 1
                    }
                    val nxt = dfs(pos + 1, nextTight, 1, prev1, d)
                    totalCount += nxt.count
                    totalSum += nxt.sum + add * nxt.count
                }
            }
        }
        val result = Pair(totalCount, totalSum)
        memo[pos][tight][started][prev2][prev1] = result
        return result
    }
}
