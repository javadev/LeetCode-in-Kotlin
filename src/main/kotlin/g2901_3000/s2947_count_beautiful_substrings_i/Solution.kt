package g2901_3000.s2947_count_beautiful_substrings_i

// #Medium #String #Prefix_Sum #Enumeration #2023_12_31_Time_291_ms_(59.52%)_Space_35.1_MB_(100.00%)

class Solution {
    fun beautifulSubstrings(s: String, k: Int): Int {
        val numVowels = IntArray(s.length + 1)
        for (i in s.indices) {
            val c = s[i]
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                numVowels[i + 1] = numVowels[i] + 1
            } else {
                numVowels[i + 1] = numVowels[i]
            }
        }
        var step = 1
        while (step < k) {
            if ((step * step) % k == 0) {
                break
            }
            step++
        }
        step *= 2
        var count = 0
        for (i in s.indices) {
            var j = i + step
            while (j <= s.length) {
                if ((numVowels[j] - numVowels[i]) * 2 == j - i) {
                    count++
                }
                j += step
            }
        }
        return count
    }
}
