package g1901_2000.s1935_maximum_number_of_words_you_can_type

// #Easy #String #Hash_Table #2023_06_20_Time_178_ms_(37.50%)_Space_37.4_MB_(50.00%)

class Solution {
    fun canBeTypedWords(text: String, brokenLetters: String): Int {
        val words = text.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        var count = 0
        for (word in words) {
            var broken = false
            for (c in word.toCharArray()) {
                if (brokenLetters.indexOf(c) != -1) {
                    broken = true
                    break
                }
            }
            if (!broken) {
                count++
            }
        }
        return count
    }
}
