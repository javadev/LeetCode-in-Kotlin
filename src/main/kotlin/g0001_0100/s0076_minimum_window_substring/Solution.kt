package g0001_0100.s0076_minimum_window_substring

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #String #Hash_Table #Sliding_Window
// #Level_2_Day_14_Sliding_Window/Two_Pointer #Top_Interview_150_Sliding_Window
// #Big_O_Time_O(s.length())_Space_O(1) #2023_07_10_Time_191_ms_(96.38%)_Space_37.2_MB_(93.33%)

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
