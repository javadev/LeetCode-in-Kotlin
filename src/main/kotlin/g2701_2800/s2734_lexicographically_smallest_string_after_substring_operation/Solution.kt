package g2701_2800.s2734_lexicographically_smallest_string_after_substring_operation

// #Medium #String #Greedy #2023_08_05_Time_384_ms_(100.00%)_Space_48.4_MB_(95.56%)

class Solution {
    fun smallestString(s: String): String {
        var resultArray = CharArray(s.length)
        var i: Int
        var found = false
        i = 0
        while (i < s.length) {
            var c = s[i]
            if (c != 'a' && !found) {
                found = true
                while (i < s.length) {
                    c = s[i]
                    if (c != 'a') {
                        c--
                        resultArray[i] = c
                    } else {
                        i--
                        break
                    }
                    i++
                }
            } else {
                resultArray[i] = c
            }
            i++
        }
        if (!found) {
            resultArray = CharArray(s.length)
            i = 0
            while (i < s.length - 1) {
                resultArray[i] = 'a'
                i++
            }
            resultArray[s.length - 1] = 'z'
        }
        return String(resultArray)
    }
}
