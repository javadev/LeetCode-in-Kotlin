package g2301_2400.s2351_first_letter_to_appear_twice

// #Easy #String #Hash_Table #Counting #2023_07_02_Time_122_ms_(100.00%)_Space_33.4_MB_(100.00%)

class Solution {
    fun repeatedCharacter(s: String): Char {
        val n = s.length
        val hm = IntArray(26)
        for (i in 0 until n) {
            val c = s[i]
            hm[c.code - 'a'.code]++
            if (hm[c.code - 'a'.code] > 1) {
                return c
            }
        }
        return '0'
    }
}
