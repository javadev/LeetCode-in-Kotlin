package g0301_0400.s0344_reverse_string

// #Easy #Top_Interview_Questions #String #Two_Pointers #Recursion #Algorithm_I_Day_4_Two_Pointers
// #Udemy_Strings #2022_11_18_Time_445_ms_(69.75%)_Space_61.9_MB_(33.77%)

class Solution {
    fun reverseString(s: CharArray) {
        var left = 0
        var right = s.size - 1
        while (left < right) {
            val tmp = s[left]
            s[left++] = s[right]
            s[right--] = tmp
        }
    }
}
