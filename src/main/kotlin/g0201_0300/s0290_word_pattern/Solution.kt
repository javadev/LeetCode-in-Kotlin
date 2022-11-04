package g0201_0300.s0290_word_pattern

// #Easy #String #Hash_Table #Data_Structure_II_Day_7_String
// #2022_11_04_Time_177_ms_(89.55%)_Space_35.2_MB_(95.52%)

class Solution {
    fun wordPattern(pattern: String, s: String): Boolean {
        val map: MutableMap<Char, String> = HashMap()
        val words = s.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        if (words.size != pattern.length) {
            return false
        }
        for (i in 0 until pattern.length) {
            if (!map.containsKey(pattern[i])) {
                if (map.containsValue(words[i])) {
                    return false
                }
                map[pattern[i]] = words[i]
            } else {
                if (words[i] != map[pattern[i]]) {
                    return false
                }
            }
        }
        return true
    }
}
