package g2201_2300.s2255_count_prefixes_of_a_given_string

// #Easy #Array #String #2023_06_28_Time_178_ms_(83.33%)_Space_36.5_MB_(100.00%)

class Solution {
    fun countPrefixes(words: Array<String?>, s: String): Int {
        var count = 0
        for (str in words) {
            if (s.indexOf(str!!) == 0) {
                ++count
            }
        }
        return count
    }
}
