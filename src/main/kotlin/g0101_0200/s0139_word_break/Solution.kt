package g0101_0200.s0139_word_break

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Hash_Table
// #Dynamic_Programming #Trie #Memoization #Algorithm_II_Day_15_Dynamic_Programming
// #Dynamic_Programming_I_Day_9 #Udemy_Dynamic_Programming #Big_O_Time_O(M+max*N)_Space_O(M+N+max)
// #2022_09_03_Time_197_ms_(87.17%)_Space_34.4_MB_(99.25%)

import java.util.HashSet

class Solution {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        val set: MutableSet<String> = HashSet()
        var max = 0
        val flag = BooleanArray(s.length + 1)
        for (st in wordDict) {
            set.add(st)
            if (max < st.length) {
                max = st.length
            }
        }
        for (i in 1..max) {
            if (dfs(s, 0, i, max, set, flag)) {
                return true
            }
        }
        return false
    }

    private fun dfs(s: String, start: Int, end: Int, max: Int, set: Set<String>, flag: BooleanArray): Boolean {
        if (!flag[end] && set.contains(s.substring(start, end))) {
            flag[end] = true
            if (end == s.length) {
                return true
            }
            for (i in 1..max) {
                if (end + i <= s.length && dfs(s, end, end + i, max, set, flag)) {
                    return true
                }
            }
        }
        return false
    }
}
