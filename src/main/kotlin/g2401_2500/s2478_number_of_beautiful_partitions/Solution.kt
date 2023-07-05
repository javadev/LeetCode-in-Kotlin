package g2401_2500.s2478_number_of_beautiful_partitions

// #Hard #String #Dynamic_Programming #2023_07_05_Time_230_ms_(100.00%)_Space_38.1_MB_(100.00%)

class Solution {
    fun beautifulPartitions(s: String, k: Int, l: Int): Int {
        val cs = s.toCharArray()
        val n = cs.size
        if (!prime(cs[0]) || prime(cs[n - 1])) {
            return 0
        }
        val dp = Array(k) { IntArray(n) }
        run {
            var i = n - l
            while (0 <= i) {
                dp[0][i] = if (prime(cs[i])) 1 else 0
                --i
            }
        }
        for (i in 1 until k) {
            var sum = 0
            run {
                var j = n - i * l
                while (0 <= j) {
                    val mod = 1e9.toInt() + 7
                    if (0 == dp[i - 1][j]) {
                        dp[i - 1][j] = sum
                    } else if (0 != j && 0 == dp[i - 1][j - 1]) {
                        sum = (sum + dp[i - 1][j]) % mod
                    }
                    --j
                }
            }
            var p = l - 1
            var j = 0
            while (j + l * i < n) {
                if (!prime(cs[j])) {
                    ++j
                    continue
                }
                p = Math.max(p, j + l - 1)
                while (prime(cs[p])) {
                    p++
                }
                if (0 == dp[i - 1][p]) {
                    break
                }
                dp[i][j] = dp[i - 1][p]
                ++j
            }
        }
        return dp[k - 1][0]
    }

    private fun prime(c: Char): Boolean {
        return '2' == c || '3' == c || '5' == c || '7' == c
    }
}
