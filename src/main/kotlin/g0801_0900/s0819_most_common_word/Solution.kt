package g0801_0900.s0819_most_common_word

// #Easy #String #Hash_Table #Counting #2023_03_24_Time_211_ms_(83.33%)_Space_36.9_MB_(88.89%)

import java.util.Locale

@Suppress("NAME_SHADOWING")
class Solution {
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        var paragraph = paragraph
        paragraph = paragraph.replace("\\p{Punct}".toRegex(), " ").lowercase(Locale.getDefault())
        val a = paragraph.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        for (i in banned.indices) {
            banned[i] = banned[i].lowercase(Locale.getDefault())
        }
        val map: MutableMap<String, Int> = HashMap()
        for (s in a) {
            val x = map.getOrDefault(s, 0)
            map[s] = x + 1
        }
        for (s in banned) {
            map.remove(s)
            map.remove("")
        }
        return map.maxBy { it.value }.key
    }
}
