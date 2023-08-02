package g0901_1000.s0953_verifying_an_alien_dictionary

// #Easy #Array #String #Hash_Table #Programming_Skills_I_Day_9_String
// #2023_05_02_Time_137_ms_(100.00%)_Space_35.5_MB_(93.75%)

class Solution {
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        val map = IntArray(26)
        for (i in order.indices) {
            map[order[i].code - 'a'.code] = i
        }
        for (i in 0 until words.size - 1) {
            if (!isSmaller(words[i], words[i + 1], map)) {
                return false
            }
        }
        return true
    }

    private fun isSmaller(str1: String, str2: String, map: IntArray): Boolean {
        val len1 = str1.length
        val len2 = str2.length
        val minLength = len1.coerceAtMost(len2)
        for (i in 0 until minLength) {
            if (map[str1[i].code - 'a'.code] > map[str2[i].code - 'a'.code]) {
                return false
            } else if (map[str1[i].code - 'a'.code] < map[str2[i].code - 'a'.code]) {
                return true
            }
        }
        return len1 <= len2
    }
}
