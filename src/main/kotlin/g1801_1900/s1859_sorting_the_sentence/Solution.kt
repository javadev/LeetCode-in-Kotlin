package g1801_1900.s1859_sorting_the_sentence

// #Easy #String #Sorting #2023_06_22_Time_155_ms_(89.29%)_Space_35.8_MB_(96.43%)

import java.util.TreeMap

class Solution {
    fun sortSentence(s: String): String {
        val words = s.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val treeMap = TreeMap<Int, String>()
        for (word in words) {
            val key = (word[word.length - 1].toString() + "").toInt()
            treeMap[key] = word.substring(0, word.length - 1)
        }
        val sb = StringBuilder()
        for ((_, value) in treeMap) {
            sb.append(value)
            sb.append(" ")
        }
        return sb.substring(0, sb.length - 1)
    }
}
