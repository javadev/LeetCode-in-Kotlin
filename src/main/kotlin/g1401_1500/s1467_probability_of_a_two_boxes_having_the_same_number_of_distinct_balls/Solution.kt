package g1401_1500.s1467_probability_of_a_two_boxes_having_the_same_number_of_distinct_balls

// #Hard #Dynamic_Programming #Math #Backtracking #Combinatorics #Probability_and_Statistics
class Solution {
    fun getProbability(balls: IntArray): Double {
        val m = balls.size
        var s = 0
        for (b in balls) {
            s += b
        }
        val c = Array(s + 1) { DoubleArray(s / 2 + 1) }
        c[0][0] = 1.0
        for (i in 1 until s + 1) {
            c[i][0] = 1.0
            for (j in 1 until s / 2 + 1) {
                c[i][j] = c[i - 1][j] + c[i - 1][j - 1]
            }
        }
        var dp = Array(2 * m + 1) { DoubleArray(s / 2 + 1) }
        dp[m][0] = 1.0
        var sum = 0
        for (b in balls) {
            sum += b
            val ndp = Array(2 * m + 1) { DoubleArray(s / 2 + 1) }
            for (i in 0..b) {
                for (j in 0 until 2 * m + 1) {
                    for (k in 0 until s / 2 + 1) {
                        if (dp[j][k] == 0.0) {
                            continue
                        }
                        val nk = k + i
                        val nr = sum - nk
                        if (nk <= s / 2 && nr <= s / 2) {
                            val i1 = if (i == b) j + 1 else j
                            val nj = if (i == 0) j - 1 else i1
                            ndp[nj][nk] += dp[j][k] * c[b][i]
                        }
                    }
                }
            }
            dp = ndp
        }
        return dp[m][s / 2] / c[s][s / 2]
    }
}
