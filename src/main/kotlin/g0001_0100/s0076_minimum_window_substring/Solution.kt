package g0001_0100.s0076_minimum_window_substring

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #String #Hash_Table #Sliding_Window
// #Level_2_Day_14_Sliding_Window/Two_Pointer
// #2022_08_31_Time_346_ms_(85.20%)_Space_39.3_MB_(93.88%)

class Solution {
    fun minWindow(s: String, t: String): String {
        val map = IntArray(128)
        for (element in t) {
            map[element - 'A']++
        }
        var count = t.length
        var begin = 0
        var end = 0
        var d = Int.MAX_VALUE
        var head = 0
        while (end < s.length) {
            if (map[s[end++] - 'A']-- > 0) {
                count--
            }
            while (count == 0) {
                if (end - begin < d) {
                    d = end - begin
                    head = begin
                }
                if (map[s[begin++] - 'A']++ == 0) {
                    count++
                }
            }
        }
        return if (d == Int.MAX_VALUE) "" else s.substring(head, head + d)
    }
}
