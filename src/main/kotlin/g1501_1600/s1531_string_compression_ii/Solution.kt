package g1501_1600.s1531_string_compression_ii

// #Hard #String #Dynamic_Programming #2023_06_12_Time_207_ms_(100.00%)_Space_36.8_MB_(100.00%)

class Solution {
    private val dp = Array(101) { IntArray(101) }
    private fun getLen(cnt: Int): Int {
        if (cnt == 0) {
            return 0
        }
        if (cnt == 1) {
            return 1
        }
        if (cnt < 10) {
            return 2
        }
        return if (cnt < 100) {
            3
        } else {
            4
        }
    }

    fun getLengthOfOptimalCompression(s: String, k: Int): Int {
        val sarr = s.toCharArray()
        for (i in 0..s.length) {
            for (j in 0..k) {
                dp[i][j] = -1
            }
        }
        return dfs(sarr, 0, k)
    }

    private fun dfs(sarr: CharArray, pos: Int, k: Int): Int {
        if (k < 0) {
            return -1
        }
        if (pos == sarr.size || sarr.size - pos <= k) {
            return 0
        }
        if (dp[pos][k] != -1) {
            return dp[pos][k]
        }
        val cnts = IntArray(26)
        var most = 0
        var res = -1
        for (j in pos until sarr.size) {
            cnts[sarr[j].code - 'a'.code]++
            most = Math.max(most, cnts[sarr[j].code - 'a'.code])
            val cost = dfs(sarr, j + 1, k - (j - pos + 1 - most))
            if (cost == -1) {
                continue
            }
            res = if (res == -1) {
                cost + getLen(most)
            } else {
                Math.min(res, cost + getLen(most))
            }
        }
        dp[pos][k] = res
        return res
    }
}
