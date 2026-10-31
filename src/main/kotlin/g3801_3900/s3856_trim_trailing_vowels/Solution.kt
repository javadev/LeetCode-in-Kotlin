package g3801_3900.s3856_trim_trailing_vowels

// #Easy #String #Mid_Level #Weekly_Contest_491
// #2026_07_27_Time_1_ms_(99.24%)_Space_44.18_MB_(85.98%)

class Solution {
    fun trimTrailingVowels(s: String): String {
        var i = s.length - 1
        while (i >= 0 &&
            (s.get(i) == 'a' || s.get(i) == 'e' || s.get(i) == 'i' || s.get(i) == 'o' || s.get(i) == 'u')
        ) {
            i--
        }
        return s.substring(0, i + 1)
    }
}
