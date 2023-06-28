package g2201_2300.s2255_count_prefixes_of_a_given_string

// #Easy #Array #String
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
