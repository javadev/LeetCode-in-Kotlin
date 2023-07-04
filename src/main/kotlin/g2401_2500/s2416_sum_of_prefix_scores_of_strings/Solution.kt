package g2401_2500.s2416_sum_of_prefix_scores_of_strings

// #Hard #Array #String #Counting #Trie #2023_07_04_Time_2062_ms_(50.00%)_Space_191.8_MB_(100.00%)

class Solution {
    private val child: Array<Solution?> = arrayOfNulls(26)
    private var ct: Int = 0

    fun sumPrefixScores(words: Array<String>): IntArray {
        for (s in words) {
            insert(s)
        }
        val res = IntArray(words.size)
        for (i in words.indices) {
            val word = words[i]
            res[i] = countPre(word)
        }
        return res
    }

    private fun insert(word: String) {
        var cur: Solution? = this
        for (element in word) {
            val id = element.code - 'a'.code
            if (cur!!.child[id] == null) {
                cur.child[id] = Solution()
            }
            cur.child[id]!!.ct++
            cur = cur.child[id]
        }
    }

    private fun countPre(word: String): Int {
        var cur: Solution? = this
        var localCt = 0
        for (element in word) {
            val id = element.code - 'a'.code
            if (cur!!.child[id] == null) {
                return localCt
            }
            localCt += cur.ct
            cur = cur.child[id]
        }
        localCt += cur!!.ct
        return localCt
    }
}
