package g1401_1500.s1416_restore_the_array

// #Hard #String #Dynamic_Programming #2023_06_07_Time_279_ms_(51.85%)_Space_45.7_MB_(24.69%)

class Solution {
    fun numberOfArrays(s: String, k: Int): Int {
        // dp[i] is number of ways to print valid arrays from string s start at i
        val dp = arrayOfNulls<Int>(s.length)
        return dfs(s, k.toLong(), 0, dp)
    }

    private fun dfs(s: String, k: Long, i: Int, dp: Array<Int?>): Int {
        // base case -> Found a valid way
        if (i == s.length) return 1
        // all numbers are in range [1, k] and there are no leading zeros -> So numbers starting with 0 mean invalid!
        if (s[i] == '0') return 0
        if (dp[i] != null) return dp[i]!!
        var ans = 0
        var num: Long = 0
        for (j in i until s.length) {
            // num is the value of the substring s[i..j]
            num = num * 10 + s[j].code.toLong() - '0'.code.toLong()
            // num must be in range [1, k]
            if (num > k) break
            ans += dfs(s, k, j + 1, dp)
            ans %= 1000000007
        }
        return ans.also { dp[i] = it }
    }
}
