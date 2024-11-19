package g3101_3200.s3136_valid_word

// #Easy #String #2024_05_07_Time_160_ms_(92.50%)_Space_35.5_MB_(90.00%)

class Solution {
    fun isValid(word: String): Boolean {
        if (word.length < 3) {
            return false
        }
        if (word.contains("@") || word.contains("#") || word.contains("$")) {
            return false
        }
        val vowels = charArrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
        val consonants = charArrayOf(
            'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v',
            'w', 'x', 'y', 'z', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q',
            'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z',
        )
        var flag1 = false
        var flag2 = false
        for (c in vowels) {
            if (word.indexOf(c) != -1) {
                flag1 = true
                break
            }
        }
        for (c in consonants) {
            if (word.indexOf(c) != -1) {
                flag2 = true
                break
            }
        }
        return flag1 && flag2
    }
}
