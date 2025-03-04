package g0001_0100.s0030_substring_with_concatenation_of_all_words

// #Hard #String #Hash_Table #Sliding_Window #Top_Interview_150_Sliding_Window
// #2025_03_04_Time_14_ms_(98.62%)_Space_39.70_MB_(91.72%)

class Solution {
    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val ans: MutableList<Int> = ArrayList<Int>()
        val n1 = words[0].length
        val n2 = s.length
        val map1: MutableMap<String, Int> = HashMap<String, Int>()
        for (ch in words) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1)
        }
        for (i in 0..<n1) {
            var left = i
            var j = i
            var c = 0
            val map2: MutableMap<String, Int> = HashMap<String, Int>()
            while (j + n1 <= n2) {
                val word1 = s.substring(j, j + n1)
                j += n1
                if (map1.containsKey(word1)) {
                    map2.put(word1, map2.getOrDefault(word1, 0) + 1)
                    c++
                    while (map2[word1]!! > map1[word1]!!) {
                        val word2 = s.substring(left, left + n1)
                        map2.put(word2, map2[word2]!! - 1)
                        left += n1
                        c--
                    }
                    if (c == words.size) {
                        ans.add(left)
                    }
                } else {
                    map2.clear()
                    c = 0
                    left = j
                }
            }
        }
        return ans
    }
}
