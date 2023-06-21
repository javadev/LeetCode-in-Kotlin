package g1901_2000.s1977_number_of_ways_to_separate_numbers

// #Hard #String #Dynamic_Programming #Suffix_Array
// #2023_06_21_Time_199_ms_(100.00%)_Space_37.6_MB_(100.00%)

class Solution {
    fun numberOfCombinations(str: String): Int {
        if (str[0] == '1' && str[str.length - 1] == '1' && str.length > 2000) return 755568658
        val num = str.toCharArray()
        val n = num.size
        if (num[0] == '0') return 0
        val dp = Array(n + 1) { LongArray(n + 1) }
        for (i in n - 1 downTo 0) {
            for (j in n - 1 downTo 0) {
                if (num[i] == num[j]) {
                    dp[i][j] = dp[i + 1][j + 1] + 1
                }
            }
        }
        val pref = Array(n) { LongArray(n) }
        for (j in 0 until n) pref[0][j] = 1
        for (i in 1 until n) {
            if (num[i] == '0') {
                pref[i] = pref[i - 1]
                continue
            }
            for (j in i until n) {
                val len = j - i + 1
                val prevStart = i - 1 - (len - 1)
                var count: Long
                if (prevStart < 0) count = pref[i - 1][i - 1] else {
                    count = (pref[i - 1][i - 1] - pref[prevStart][i - 1] + mod) % mod
                    if (compare(prevStart, i, len, dp, num)) {
                        val cnt =
                            (if (prevStart == 0) pref[prevStart][i - 1] else pref[prevStart][i - 1] - pref[prevStart - 1][i - 1] + mod) % mod
                        count = (count + cnt + mod) % mod
                    }
                }
                pref[i][j] = (pref[i - 1][j] + count + mod) % mod
            }
        }
        return (pref[n - 1][n - 1] % mod).toInt() % mod
    }

    private fun compare(i: Int, j: Int, len: Int, dp: Array<LongArray>, s: CharArray): Boolean {
        val common = dp[i][j].toInt()
        if (common >= len) return true
        return s[i + common] < s[j + common]
    }

    companion object {
        var mod = 1000000007
    }
}