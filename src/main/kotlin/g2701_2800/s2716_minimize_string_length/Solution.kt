package g2701_2800.s2716_minimize_string_length

// #Easy #String #Hash_Table #2023_08_01_Time_204_ms_(97.62%)_Space_37.6_MB_(79.76%)

class Solution {
    fun minimizedStringLength(s: String): Int {
        val charMap = HashMap<Char, Int>()
        for (i in s.indices) {
            val currentCount = charMap.getOrDefault(s[i], 0)
            charMap.put(s[i], currentCount + 1)
        }
        return charMap.size
    }
}
