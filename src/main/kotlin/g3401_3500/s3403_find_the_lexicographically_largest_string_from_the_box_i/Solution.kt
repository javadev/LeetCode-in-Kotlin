package g3401_3500.s3403_find_the_lexicographically_largest_string_from_the_box_i

// #Medium #String #Two_Pointers #Enumeration
// #2024_12_29_Time_22_ms_(100.00%)_Space_38.72_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun answerString(word: String, numFriends: Int): String {
        if (numFriends == 1) {
            return word
        }
        val n = word.length
        val maxlen = n - numFriends + 1
        var maxchar = word[0]
        var res = ""
        for (i in 0..<n) {
            if (word[i] >= maxchar) {
                val curr = word.substring(i, min((i + maxlen), n))
                if (curr > res) {
                    res = curr
                }
                maxchar = word[i]
            }
        }
        return res
    }
}
