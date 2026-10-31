package g3701_3800.s3775_reverse_words_with_same_vowel_count

// #Medium #String #Two_Pointers #Simulation #Senior #Weekly_Contest_480
// #2026_05_08_Time_41_ms_(96.14%)_Space_48.30_MB_(90.84%)

class Solution {
    fun reverseWords(s: String): String {
        val wrd = s.toCharArray()
        val vowels = "aeiou"
        var left = 0
        var right = 0
        var firstWrd = 0
        var anotherWrd = 0
        while (left < wrd.size) {
            right = left
            anotherWrd = 0
            while (right < wrd.size && wrd[right] != ' ') {
                if (vowels.indexOf(wrd[right]) != -1) {
                    if (left == 0) {
                        firstWrd++
                    } else {
                        anotherWrd++
                    }
                }
                right++
            }
            if (left != 0 && anotherWrd == firstWrd) {
                var l = left
                var r = right - 1
                while (l < r) {
                    val temp = wrd[r]
                    wrd[r--] = wrd[l]
                    wrd[l++] = temp
                }
            }
            left = right + 1
        }
        return String(wrd)
    }
}
