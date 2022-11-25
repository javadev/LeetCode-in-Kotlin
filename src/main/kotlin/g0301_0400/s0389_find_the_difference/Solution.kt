package g0301_0400.s0389_find_the_difference

// #Easy #String #Hash_Table #Sorting #Bit_Manipulation #Programming_Skills_I_Day_8_String
// #Udemy_Bit_Manipulation #2022_11_24_Time_256_ms_(64.81%)_Space_34.8_MB_(100.00%)

class Solution {
    fun findTheDifference(s: String, t: String): Char {
        var c = 0.toChar()
        for (cs in s.toCharArray()) {
            c = (c.code xor cs.code).toChar()
        }
        for (ct in t.toCharArray()) {
            c = (c.code xor ct.code).toChar()
        }
        return c
    }
}