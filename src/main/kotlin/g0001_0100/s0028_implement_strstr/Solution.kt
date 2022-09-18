package g0001_0100.s0028_implement_strstr

// #Easy #Top_Interview_Questions #String #Two_Pointers #String_Matching
// #Programming_Skills_II_Day_1 #2022_09_18_Time_257_ms_(32.35%)_Space_34.5_MB_(60.63%)

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
