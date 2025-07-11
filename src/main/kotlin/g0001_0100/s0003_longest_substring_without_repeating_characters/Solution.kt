package g0001_0100.s0003_longest_substring_without_repeating_characters

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Hash_Table #Sliding_Window
// #Algorithm_I_Day_6_Sliding_Window #Level_2_Day_14_Sliding_Window/Two_Pointer #Udemy_Strings
// #Top_Interview_150_Sliding_Window #Big_O_Time_O(n)_Space_O(1) #AI_can_be_used_to_solve_the_task
// #2025_07_11_Time_3_ms_(99.17%)_Space_46.05_MB_(66.40%)

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val lastIndices = IntArray(256) { -1 }
        var maxLen = 0
        var curLen = 0
        var start = 0
        for (i in s.indices) {
            val cur = s[i]
            if (lastIndices[cur.code] < start) {
                lastIndices[cur.code] = i
                curLen++
            } else {
                val lastIndex = lastIndices[cur.code]
                start = lastIndex + 1
                curLen = i - start + 1
                lastIndices[cur.code] = i
            }
            if (curLen > maxLen) {
                maxLen = curLen
            }
        }
        return maxLen
    }
}
