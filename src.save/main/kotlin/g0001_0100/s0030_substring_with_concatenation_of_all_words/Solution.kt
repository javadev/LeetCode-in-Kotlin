package g0001_0100.s0030_substring_with_concatenation_of_all_words

// #Hard #String #Hash_Table #Sliding_Window
// #2023_07_03_Time_182_ms_(100.00%)_Space_37.9_MB_(100.00%)

class Solution {
    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val indices: MutableList<Int> = ArrayList()
        if (words.size == 0) {
            return indices
        }
        // Put each word into a HashMap and calculate word frequency
        val wordMap: MutableMap<String, Int> = HashMap()
        for (word in words) {
            wordMap[word] = wordMap.getOrDefault(word, 0) + 1
        }
        val wordLength = words[0].length
        val window = words.size * wordLength
        for (i in 0 until wordLength) {
            // move a word's length each time
            var j = i
            while (j + window <= s.length) {

                // get the subStr
                val subStr = s.substring(j, j + window)
                val map: MutableMap<String, Int> = HashMap()
                // start from the last word
                for (k in words.indices.reversed()) {
                    // get the word from subStr
                    val word = subStr.substring(k * wordLength, (k + 1) * wordLength)
                    val count = map.getOrDefault(word, 0) + 1
                    // if the num of the word is greater than wordMap's, move (k * wordLength) and
                    // break
                    if (count > wordMap.getOrDefault(word, 0)) {
                        j = j + k * wordLength
                        break
                    } else if (k == 0) {
                        indices.add(j)
                    } else {
                        map[word] = count
                    }
                }
                j = j + wordLength
            }
        }
        return indices
    }
}
