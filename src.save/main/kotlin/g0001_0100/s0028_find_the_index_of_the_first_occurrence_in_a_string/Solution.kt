package g0001_0100.s0028_find_the_index_of_the_first_occurrence_in_a_string

// #Easy #Top_Interview_Questions #String #Two_Pointers #String_Matching
// #Programming_Skills_II_Day_1 #2023_07_03_Time_126_ms_(97.58%)_Space_34.2_MB_(76.09%)

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) {
            return 0
        }
        val m = haystack.length
        val n = needle.length
        for (start in 0 until m - n + 1) {
            if (haystack.substring(start, start + n) == needle) {
                return start
            }
        }
        return -1
    }
}
