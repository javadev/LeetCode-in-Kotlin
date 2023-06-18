package g1701_1800.s1745_palindrome_partitioning_iv

// #Hard #String #Dynamic_Programming #2023_06_16_Time_179_ms_(100.00%)_Space_36.4_MB_(100.00%)

class Solution {
    fun checkPartitioning(s: String): Boolean {
        val len: Int = s.length
        val ch: CharArray = s.toCharArray()
        val dp = IntArray(len + 1)
        dp[0] = 0x01
        for (i in 0 until len) {
            for (l: Int in intArrayOf(i - 1, i)) {
                var r: Int = i
                var localL = l
                while ((localL >= 0) && (r < len) && (ch[localL] == ch[r])) {
                    dp[r + 1] = dp[r + 1] or (dp[localL] shl 1)
                    localL--
                    r++
                }
            }
        }
        return (dp[len] and 0x08) == 0x08
    }
}
