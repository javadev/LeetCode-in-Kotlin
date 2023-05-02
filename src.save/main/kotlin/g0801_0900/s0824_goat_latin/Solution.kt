package g0801_0900.s0824_goat_latin

// #Easy #String #2023_03_25_Time_146_ms_(100.00%)_Space_35.8_MB_(90.00%)

class Solution {
    fun toGoatLatin(sentence: String): String {
        val splits = sentence.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val sb = StringBuilder()
        val a = StringBuilder()
        for (word in splits) {
            if (isVowel(word[0])) {
                sb.append(word).append("ma")
            } else {
                val firstChar = word[0]
                sb.append(word.substring(1)).append(firstChar).append("ma")
            }
            a.append("a")
            sb.append(a)
            sb.append(" ")
        }
        return sb.toString().trim { it <= ' ' }
    }

    private fun isVowel(c: Char): Boolean {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
    }
}
