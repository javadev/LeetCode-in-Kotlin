package g0101_0200.s0127_word_ladder

// #Hard #Top_Interview_Questions #String #Hash_Table #Breadth_First_Search
// #Graph_Theory_I_Day_12_Breadth_First_Search #Top_Interview_150_Graph_BFS
// #2022_10_08_Time_396_ms_(98.68%)_Space_49.1_MB_(80.26%)

class Solution {
    fun ladderLength(beginWord: String, endWord: String, wordDict: List<String>): Int {
        var beginSet: MutableSet<String> = HashSet()
        var endSet: MutableSet<String> = HashSet()
        val wordSet: Set<String> = HashSet(wordDict)
        val visited: MutableSet<String> = HashSet()
        if (!wordDict.contains(endWord)) {
            return 0
        }
        var len = 1
        val strLen = beginWord.length
        beginSet.add(beginWord)
        endSet.add(endWord)
        while (beginSet.isNotEmpty() && endSet.isNotEmpty()) {
            if (beginSet.size > endSet.size) {
                val temp = beginSet
                beginSet = endSet
                endSet = temp
            }
            val tempSet: MutableSet<String> = HashSet()
            for (s in beginSet) {
                val chars = s.toCharArray()
                for (i in 0 until strLen) {
                    val old = chars[i]
                    var j = 'a'
                    while (j <= 'z') {
                        chars[i] = j
                        val temp = String(chars)
                        if (endSet.contains(temp)) {
                            return len + 1
                        }
                        if (!visited.contains(temp) && wordSet.contains(temp)) {
                            tempSet.add(temp)
                            visited.add(temp)
                        }
                        j++
                    }
                    chars[i] = old
                }
            }
            beginSet = tempSet
            len++
        }
        return 0
    }
}
