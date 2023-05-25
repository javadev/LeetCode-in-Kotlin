package g1101_1200.s1160_find_words_that_can_be_formed_by_characters

// #Easy #Array #String #Hash_Table #2023_05_25_Time_288_ms_(72.22%)_Space_75.8_MB_(33.33%)

class Solution {
    fun countCharacters(words: Array<String>, chars: String): Int {
        var length = 0
        val map: MutableMap<Char, Int> = HashMap()
        for (c in chars.toCharArray()) {
            val count = map.getOrDefault(c, 0)
            map[c] = count + 1
        }
        for (word in words) {
            if (canForm(word, map)) {
                length += word.length
            }
        }
        return length
    }

    private fun canForm(word: String, map: Map<Char, Int>): Boolean {
        val tmp: MutableMap<Char, Int> = HashMap(map)
        for (c in word.toCharArray()) {
            if (tmp.containsKey(c) && tmp[c]!! > 0) {
                val count = tmp[c]!!
                tmp[c] = count - 1
            } else {
                return false
            }
        }
        return true
    }
}
