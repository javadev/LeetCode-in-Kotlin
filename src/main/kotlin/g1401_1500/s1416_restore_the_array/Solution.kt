package g1401_1500.s1416_restore_the_array

// #Hard #String #Dynamic_Programming
class Solution {
    fun numberOfArrays(s: String, k: Int): Int {
        val kMod = 1000000007
        val n = s.length
        val dp = IntArray(n)
        if (s[n - 1] != '0') {
            dp[n - 1] = 1
        }
        for (i in n - 2 downTo 0) {
            if (s[i] == '0') {
                continue
            }
            var temp: Long = 0
            var j = i
            while (j < n && temp * 10 + s[j].code.toLong() - '0'.code.toLong() <= k) {
                temp = temp * 10 + s[j].code.toLong() - '0'.code.toLong()
                if (j == n - 1) {
                    dp[i] += 1
                } else {
                    dp[i] += dp[j + 1]
                }
                dp[i] %= kMod
                j++
            }
        }
        return dp[0]
    }
}
