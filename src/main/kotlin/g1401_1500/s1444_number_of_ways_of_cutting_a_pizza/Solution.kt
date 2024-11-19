package g1401_1500.s1444_number_of_ways_of_cutting_a_pizza

// #Hard #Array #Dynamic_Programming #Matrix #Memoization
// #2023_06_07_Time_175_ms_(75.00%)_Space_34.7_MB_(100.00%)

class Solution {
    fun ways(pizza: Array<String>, k: Int): Int {
        if (pizza.isEmpty()) {
            return 0
        }
        val m = pizza.size
        val n = pizza[0].length
        val prefix = Array(m + 1) { IntArray(n + 1) }
        for (i in 0 until m) {
            for (j in 0 until n) {
                prefix[i + 1][j + 1] = (
                    (
                        prefix[i][j + 1] +
                            prefix[i + 1][j] +
                            if (pizza[i][j] == 'A') 1 else 0
                        ) -
                        prefix[i][j]
                    )
            }
        }
        val dp = Array(m) { Array(n) { IntArray(k) } }
        for (i in 0 until m) {
            for (j in 0 until n) {
                for (s in 0 until k) {
                    dp[i][j][s] = -1
                }
            }
        }
        return dfs(0, 0, m, n, k - 1, prefix, dp)
    }

    private fun dfs(
        m: Int,
        n: Int,
        temp1: Int,
        temp2: Int,
        k: Int,
        prefix: Array<IntArray>,
        dp: Array<Array<IntArray>>,
    ): Int {
        if (k == 0) {
            return if (hasApple(prefix, m, n, temp1 - 1, temp2 - 1)) 1 else 0
        }
        if (dp[m][n][k] != -1) {
            return dp[m][n][k]
        }
        var local = 0
        for (x in m until temp1 - 1) {
            local = (
                (
                    local +
                        (if (hasApple(prefix, m, n, x, temp2 - 1)) 1 else 0) *
                        dfs(x + 1, n, temp1, temp2, k - 1, prefix, dp)
                    ) %
                    K_MOD
                )
        }
        for (y in n until temp2 - 1) {
            local = (
                (
                    local +
                        (if (hasApple(prefix, m, n, temp1 - 1, y)) 1 else 0) *
                        dfs(m, y + 1, temp1, temp2, k - 1, prefix, dp)
                    ) %
                    K_MOD
                )
        }
        dp[m][n][k] = local
        return dp[m][n][k]
    }

    private fun hasApple(prefix: Array<IntArray>, x1: Int, y1: Int, x2: Int, y2: Int): Boolean {
        return (
            prefix[x2 + 1][y2 + 1] - prefix[x1][y2 + 1] - prefix[x2 + 1][y1] + prefix[x1][y1]
                > 0
            )
    }

    companion object {
        private const val K_MOD = (1e9 + 7).toInt()
    }
}
