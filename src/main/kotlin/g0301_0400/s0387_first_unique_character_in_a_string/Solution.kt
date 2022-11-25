package g0301_0400.s0387_first_unique_character_in_a_string

// #Easy #Top_Interview_Questions #String #Hash_Table #Counting #Queue
// #Data_Structure_I_Day_6_String #2022_11_24_Time_369_ms_(82.68%)_Space_53.6_MB_(66.43%)

class Solution {
    fun firstUniqChar(s: String): Int {
        var ans = Int.MAX_VALUE
        var i = 'a'
        while (i <= 'z') {
            val ind = s.indexOf(i)
            if (ind != -1 && ind == s.lastIndexOf(i)) {
                ans = Math.min(ans, ind)
            }
            i++
        }
        return if (ans == Int.MAX_VALUE) {
            -1
        } else ans
    }
}
