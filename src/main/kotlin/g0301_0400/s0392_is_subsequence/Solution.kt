package g0301_0400.s0392_is_subsequence

// #Easy #String #Dynamic_Programming #Two_Pointers #Dynamic_Programming_I_Day_19
// #Level_1_Day_2_String #Udemy_Two_Pointers
// #2022_11_25_Time_156_ms_(87.74%)_Space_33.9_MB_(90.11%)

class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var i = 0
        var j = 0

        while (i < s.length && j < t.length) {
            if (s[i] == t[j]) i++
            j++
        }

        return i == s.length
    }
}
