package g0401_0500.s0409_longest_palindrome

// #Easy #String #Hash_Table #Greedy #Data_Structure_II_Day_6_String #Level_1_Day_5_Greedy
// #2022_12_03_Time_259_ms_(60.71%)_Space_34.8_MB_(85.71%)

import java.util.BitSet

class Solution {
    fun longestPalindrome(s: String): Int {
        val set = BitSet(60)
        for (c in s.toCharArray()) {
            set.flip(c.code - 'A'.code)
        }
        return if (set.isEmpty) {
            s.length
        } else {
            s.length - set.cardinality() + 1
        }
    }
}
