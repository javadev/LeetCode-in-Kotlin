package g2901_3000.s2901_longest_unequal_adjacent_groups_subsequence_ii

// #Medium #Array #String #Dynamic_Programming
// #2023_12_27_Time_305_ms_(100.00%)_Space_47.6_MB_(75.00%)

class Solution {
    fun getWordsInLongestSubsequence(n: Int, words: Array<String>, groups: IntArray): List<String> {
        val check = IntArray(groups.size)
        val before = IntArray(groups.size)
        check.fill(1)
        before.fill(-1)
        var index = 0
        var max = 1
        for (i in 1 until n) {
            for (j in i - 1 downTo 0) {
                if (groups[i] != groups[j] && ham(words[i], words[j]) && check[j] + 1 > check[i]) {
                    check[i] = check[j] + 1
                    before[i] = j
                    if (check[i] > max) {
                        max = check[i]
                        index = i
                    }
                }
            }
        }
        val ans: MutableList<String> = ArrayList()
        while (index >= 0) {
            ans.add(words[index])
            index = before[index]
        }
        ans.reverse()
        return ans
    }

    private fun ham(s1: String, s2: String): Boolean {
        if (s1.length != s2.length) {
            return false
        }
        var count = 0
        for (i in s1.indices) {
            if (s1[i] != s2[i]) {
                count++
            }
            if (count > 1) {
                return false
            }
        }
        return count == 1
    }
}
