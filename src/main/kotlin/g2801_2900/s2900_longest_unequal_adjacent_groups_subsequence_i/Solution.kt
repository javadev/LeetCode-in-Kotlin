package g2801_2900.s2900_longest_unequal_adjacent_groups_subsequence_i

// #Medium #Array #String #Dynamic_Programming #Greedy
// #2023_12_21_Time_294_ms_(100.00%)_Space_46.3_MB_(100.00%)

class Solution {
    fun getWordsInLongestSubsequence(n: Int, words: Array<String>, groups: IntArray): List<String> {
        val ans: MutableList<String> = ArrayList()
        ans.add(words[0])
        var prev = groups[0]
        for (i in 1 until n) {
            if (prev != groups[i]) {
                ans.add(words[i])
                prev = groups[i]
            }
        }
        return ans
    }
}
