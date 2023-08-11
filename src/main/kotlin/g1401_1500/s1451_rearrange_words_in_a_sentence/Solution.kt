package g1401_1500.s1451_rearrange_words_in_a_sentence

// #Medium #String #Sorting #2023_06_13_Time_263_ms_(100.00%)_Space_38.9_MB_(75.00%)

import java.util.TreeMap

class Solution {
    fun arrangeWords(text: String): String {
        val map = TreeMap<Int, MutableList<String>>()
        val words = text.split(" ").dropLastWhile { it.isEmpty() }.toTypedArray()
        for (word in words) {
            val len = word.length
            map.putIfAbsent(len, ArrayList())
            map[len]!!.add(word.lowercase())
        }
        val sb = StringBuilder()
        var first = true
        for ((_, strings) in map) {
            for (str in strings) {
                val localStr = if (first) {
                    first = false
                    str[0].uppercaseChar().toString() + str.substring(1)
                } else {
                    str
                }
                sb.append(localStr).append(" ")
            }
        }
        return sb.substring(0, sb.length - 1)
    }
}
