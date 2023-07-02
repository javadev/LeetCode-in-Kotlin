package g1801_1900.s1880_check_if_word_equals_summation_of_two_words

// #Easy #String #2023_06_22_Time_139_ms_(80.00%)_Space_33.7_MB_(80.00%)

class Solution {
    fun isSumEqual(firstWord: String, secondWord: String, targetWord: String): Boolean {
        val sb = StringBuilder()
        val a = getSum(firstWord, sb)
        sb.setLength(0)
        val b = getSum(secondWord, sb)
        sb.setLength(0)
        val c = getSum(targetWord, sb)
        return a + b == c
    }

    private fun getSum(firstWord: String, sb: StringBuilder): Int {
        for (c in firstWord.toCharArray()) {
            sb.append(c.code - 'a'.code)
        }
        return sb.toString().toInt()
    }
}
