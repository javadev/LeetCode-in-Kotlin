package g2901_3000.s2938_separate_black_and_white_balls

// #Medium #String #Greedy #Two_Pointers #2024_01_03_Time_199_ms_(98.21%)_Space_38.7_MB_(58.93%)

class Solution {
    fun minimumSteps(s: String): Long {
        var left = 0
        var right = s.length - 1
        var total: Long = 0
        while (left < right) {
            while (left < right && s[left] == '0') {
                left++
            }
            while (left < right && s[right] == '1') {
                right--
            }
            if (left < right) {
                total += (right - left).toLong()
                left++
                right--
            }
        }
        return total
    }
}
