package g1201_1300.s1221_split_a_string_in_balanced_strings

// #Easy #String #Greedy #Counting
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
