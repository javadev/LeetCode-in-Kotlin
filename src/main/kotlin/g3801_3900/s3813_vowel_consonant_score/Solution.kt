package g3801_3900.s3813_vowel_consonant_score // #Easy #String #Simulation #Mid_Level #Weekly_Contest_485
// #2026_06_09_Time_1_ms_(100.00%)_Space_43.49_MB_(68.40%)

class Solution {
    fun vowelConsonantScore(s: String): Int {
        var count = 0
        val vowels = "aeiou"
        var con = 0
        for (ch in s.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++
                continue
            }
            if (Character.isAlphabetic(ch.code)) {
                con++
            }
        }
        return if (con == 0) 0 else count / con
    }
}
