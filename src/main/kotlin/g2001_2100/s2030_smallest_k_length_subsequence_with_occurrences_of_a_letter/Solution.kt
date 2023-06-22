package g2001_2100.s2030_smallest_k_length_subsequence_with_occurrences_of_a_letter

// #Hard #String #Greedy #Stack #Monotonic_Stack
@Suppress("NAME_SHADOWING")
class Solution {
    fun smallestSubsequence(s: String, k: Int, letter: Char, repetition: Int): String {
        var repetition = repetition
        var count = 0
        for (c in s.toCharArray()) {
            count += if (c == letter) 1 else 0
        }
        val sb = StringBuilder()
        var i = 0
        while (i < s.length) {
            while (sb.length + s.length > i + k && sb.isNotEmpty() &&
                s[i] < sb[sb.length - 1] && (sb[sb.length - 1] != letter || count != repetition)
            ) {
                repetition += if (sb[sb.length - 1] == letter) 1 else 0
                sb.setLength(sb.length - 1)
            }
            if (k - sb.length > Math.max(0, if (s[i] == letter) 0 else repetition)) {
                sb.append(s[i])
                repetition -= if (s[i] == letter) 1 else 0
            }
            count -= if (s[i++] == letter) 1 else 0
        }
        return sb.toString()
    }
}
