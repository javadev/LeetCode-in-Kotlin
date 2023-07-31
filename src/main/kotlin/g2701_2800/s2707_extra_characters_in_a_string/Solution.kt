package g2701_2800.s2707_extra_characters_in_a_string

// #Medium #Array #String #Hash_Table #Dynamic_Programming #Trie
// #2023_07_31_Time_276_ms_(85.71%)_Space_38_MB_(100.00%)

class Solution {
    fun minExtraChar(s: String, dictionary: Array<String>): Int {
        val dict: MutableSet<String> = HashSet()
        val dp = IntArray(s.length + 1)
        for (word in dictionary) dict.add(word)
        for (i in 1 until dp.size) {
            dp[i] = dp[i - 1] + 1
            for (j in i - 1 downTo 0) {
                val sub: String = s.substring(j, i)
                if (dict.contains(sub)) dp[i] = dp[i].coerceAtMost(dp[j])
            }
        }
        return dp[dp.size - 1]
    }
}
