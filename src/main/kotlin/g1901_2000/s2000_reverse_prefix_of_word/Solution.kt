package g1901_2000.s2000_reverse_prefix_of_word

// #Easy #String #Two_Pointers #2023_06_21_Time_164_ms_(31.25%)_Space_35.2_MB_(65.63%)

class Solution {
    fun reversePrefix(word: String, ch: Char): String {
        var i = 0
        var j = word.indexOf(ch)
        val charArr = word.toCharArray()
        while (i < j) {
            val temp = charArr[i]
            charArr[i] = charArr[j]
            charArr[j] = temp
            i++
            j--
        }
        return String(charArr)
    }
}
