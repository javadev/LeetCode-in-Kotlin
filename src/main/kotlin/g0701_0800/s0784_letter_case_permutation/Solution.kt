package g0701_0800.s0784_letter_case_permutation

// #Medium #String #Bit_Manipulation #Backtracking #Algorithm_I_Day_11_Recursion_Backtracking
// #2023_03_12_Time_219_ms_(84.62%)_Space_37.7_MB_(64.10%)

import java.util.Locale

class Solution {
    private val ans: MutableList<String> = ArrayList()
    fun letterCasePermutation(s: String): List<String> {
        helper(s, 0, "")
        return ans
    }

    private fun helper(s: String, curr: Int, temp: String) {
        if (curr == s.length) {
            ans.add(temp)
            return
        }
        if (Character.isDigit(s[curr])) {
            helper(s, curr + 1, temp + s[curr])
        } else {
            if (Character.isLowerCase(s[curr])) {
                helper(s, curr + 1, temp + s[curr])
                helper(s, curr + 1, temp + s.substring(curr, curr + 1).uppercase(Locale.getDefault()))
            } else {
                helper(s, curr + 1, temp + s[curr])
                helper(s, curr + 1, temp + s.substring(curr, curr + 1).lowercase(Locale.getDefault()))
            }
        }
    }
}
