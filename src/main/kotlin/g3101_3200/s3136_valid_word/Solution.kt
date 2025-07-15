package g3101_3200.s3136_valid_word

// #Easy #String #2025_07_15_Time_2_ms_(100.00%)_Space_41.87_MB_(100.00%)

class Solution {
    fun isValid(word: String): Boolean {
        if (word.length < 3) {
            return false
        }
        var hasVowel = false
        var hasConsonant = false
        for (c in word.toCharArray()) {
            if (Character.isLetter(c)) {
                val ch = c.lowercaseChar()
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    hasVowel = true
                } else {
                    hasConsonant = true
                }
            } else if (!Character.isDigit(c)) {
                return false
            }
        }
        return hasVowel && hasConsonant
    }
}
