package g1401_1500.s1451_rearrange_words_in_a_sentence

import java.util.TreeMap

// #Medium #String #Sorting
class Solution {
    fun arrangeWords(text: String): String {
        val map = TreeMap<Int, MutableList<String>>()
        val words = text.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
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
