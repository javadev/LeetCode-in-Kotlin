package g2201_2300.s2267_check_if_there_is_a_valid_parentheses_string_path

// #Hard #Array #Dynamic_Programming #Matrix
class Solution {
    private lateinit var grid: Array<CharArray>
    private var m = 0
    private var n = 0

    fun hasValidPath(grid: Array<CharArray>): Boolean {
        this.grid = grid
        m = grid.size
        n = grid[0].size
        val dp = Array(m) { Array(n) { arrayOfNulls<Boolean>(m + n + 1) } }
        if (grid[0][0] == RGTPAR) {
            return false
        }
        return if ((m + n) % 2 == 0) {
            false
        } else dfs(0, 0, 0, 0, dp)
    }

    private fun dfs(u: Int, v: Int, open: Int, close: Int, dp: Array<Array<Array<Boolean?>>>): Boolean {
        var open = open
        var close = close
        if (grid[u][v] == LFTPAR) {
            open++
        } else {
            close++
        }
        if (u == m - 1 && v == n - 1) {
            return open == close
        }
        if (open < close) {
            return false
        }
        if (dp[u][v][open - close] != null) {
            return dp[u][v][open - close]!!
        }
        if (u == m - 1) {
            val result = dfs(u, v + 1, open, close, dp)
            dp[u][v][open - close] = result
            return result
        }
        if (v == n - 1) {
            return dfs(u + 1, v, open, close, dp)
        }
        val rslt: Boolean
        rslt =
            if (grid[u][v] == LFTPAR) {
                dfs(u + 1, v, open, close, dp) || dfs(u, v + 1, open, close, dp)
            } else {
                dfs(u, v + 1, open, close, dp) || dfs(u + 1, v, open, close, dp)
            }
        dp[u][v][open - close] = rslt
        return rslt
    }

    companion object {
        private const val LFTPAR = '('
        private const val RGTPAR = ')'
    }
}
