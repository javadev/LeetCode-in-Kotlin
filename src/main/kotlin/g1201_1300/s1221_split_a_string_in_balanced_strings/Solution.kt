package g1201_1300.s1221_split_a_string_in_balanced_strings

// #Easy #String #Greedy #Counting #2023_06_09_Time_131_ms_(67.65%)_Space_33.7_MB_(61.76%)

class Solution {
    fun balancedStringSplit(s: String): Int {
        var i = 0
        var balancedCount = 0
        var lCount = 0
        var rCount = 0
        while (i < s.length) {
            if (s[i] == 'L') {
                lCount++
            } else {
                rCount++
            }
            i++
            if (lCount != 0 && lCount == rCount) {
                lCount = 0
                rCount = 0
                balancedCount++
            }
        }
        return balancedCount
    }
}
