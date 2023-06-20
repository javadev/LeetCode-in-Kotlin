package g1901_2000.s2000_reverse_prefix_of_word

// #Easy #String #Two_Pointers
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
