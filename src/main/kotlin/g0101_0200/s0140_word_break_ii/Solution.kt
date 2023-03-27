package g0101_0200.s0140_word_break_ii

// #Hard #Top_Interview_Questions #String #Hash_Table #Dynamic_Programming #Backtracking #Trie
// #Memoization #2022_10_09_Time_287_ms_(44.19%)_Space_34.8_MB_(83.72%)

import java.util.LinkedList

class Solution {
    fun wordBreak(s: String, wordDict: List<String>?): List<String> {
        val result: MutableList<String> = LinkedList()
        val wordSet: Set<String> = HashSet(wordDict)
        dfs(s, wordSet, 0, StringBuilder(), result)
        return result
    }

    private fun dfs(
        s: String,
        wordSet: Set<String>,
        index: Int,
        sb: StringBuilder,
        result: MutableList<String>
    ) {
        if (index == s.length) {
            if (sb[sb.length - 1] == ' ') {
                sb.setLength(sb.length - 1)
            }
            result.add(sb.toString())
            return
        }
        val len = sb.length
        for (i in index + 1..s.length) {
            val subs = s.substring(index, i)
            if (wordSet.contains(subs)) {
                sb.append(subs).append(" ")
                dfs(s, wordSet, i, sb, result)
            }
            sb.setLength(len)
        }
    }
}
