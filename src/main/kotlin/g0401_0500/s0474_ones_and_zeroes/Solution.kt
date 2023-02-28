package g0401_0500.s0474_ones_and_zeroes

// #Medium #Array #String #Dynamic_Programming
// #2022_12_31_Time_204_ms_(100.00%)_Space_35.7_MB_(92.31%)

class Solution {
    /*
     * The problem can be interpreted as:
     * What's the max number of str can we pick from strs with limitation of m "0"s and n "1"s.
     *
     * Thus we can define dp[i][j] as it stands for max number of str can we pick from strs with limitation
     * of i "0"s and j "1"s.
     *
     * For each str, assume it has a "0"s and b "1"s, we update the dp array iteratively
     * and set dp[i][j] = Math.max(dp[i][j], dp[i - a][j - b] + 1).
     * So at the end, dp[m][n] is the answer.
     */
    fun findMaxForm(strs: Array<String>, m: Int, n: Int): Int {
        val dp = Array(m + 1) { IntArray(n + 1) }
        for (str in strs) {
            val count = count(str)
            for (i in m downTo count[0]) {
                for (j in n downTo count[1]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - count[0]][j - count[1]] + 1)
                }
            }
        }
        return dp[m][n]
    }

    private fun count(str: String): IntArray {
        val res = IntArray(2)
        for (i in 0 until str.length) {
            res[str[i].code - '0'.code]++
        }
        return res
    }
}
