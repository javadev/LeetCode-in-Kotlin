package g1301_1400.s1316_distinct_echo_substrings

// #Hard #String #Dynamic_Programming #Sliding_Window #Trie #Hash_Function #Rolling_Hash
class Solution {
    fun distinctEchoSubstrings(text: String): Int {
        val n = text.length
        val dp = Array(n) { IntArray(n) }
        for (i in 0 until n) {
            var hash: Long = 0
            for (j in i until n) {
                hash = hash * PRIME + (text[j].code - 'a'.code + 1)
                hash %= MOD.toLong()
                dp[i][j] = hash.toInt()
            }
        }
        val set: MutableSet<Int> = HashSet()
        var res = 0
        for (i in 0 until n - 1) {
            var j = i
            while (2 * j - i + 1 < n) {
                if (dp[i][j] == dp[j + 1][2 * j - i + 1] && set.add(dp[i][j])) {
                    res++
                }
                j++
            }
        }
        return res
    }

    companion object {
        private const val PRIME = 101
        private const val MOD = 1000000007
    }
}
