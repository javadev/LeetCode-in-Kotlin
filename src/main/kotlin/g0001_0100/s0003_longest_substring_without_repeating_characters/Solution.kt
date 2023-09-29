package g0001_0100.s0003_longest_substring_without_repeating_characters

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Hash_Table #Sliding_Window
// #Algorithm_I_Day_6_Sliding_Window #Level_2_Day_14_Sliding_Window/Two_Pointer #Udemy_Strings
// #Big_O_Time_O(n)_Space_O(1) #2023_07_03_Time_201_ms_(87.28%)_Space_38.3_MB_(60.85%)

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var i = 0
        var j = 0
        var longest = 0
        // 1. if string empty, return 0
        if (s.isEmpty()) {
            return 0
        }
        while (j < s.length) {
            // 2. if the char at index j already seen, update the longest if needs
            if (i != j && s.substring(i, j).indexOf(s[j]) > -1) {
                longest = Math.max(j - i, longest)
                i++
            } else {
                // 3. j out of bound already, update longest
                if (++j == s.length) {
                    longest = Math.max(s.length - i, longest)
                    break
                }
            }
        }
        return longest
    }
}
