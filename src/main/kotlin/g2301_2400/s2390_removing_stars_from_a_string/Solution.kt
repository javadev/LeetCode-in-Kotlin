package g2301_2400.s2390_removing_stars_from_a_string

// #Medium #String #Stack #Simulation #LeetCode_75_Stack
// #2023_07_02_Time_337_ms_(62.92%)_Space_39.3_MB_(88.76%)

class Solution {
    fun removeStars(s: String): String {
        val sb = StringBuilder()
        var stars = 0
        for (i in s.length - 1 downTo 0) {
            if (s[i] == '*') {
                ++stars
            } else if (stars > 0) {
                --stars
            } else {
                sb.append(s[i])
            }
        }
        return sb.reverse().toString()
    }
}
