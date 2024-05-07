package g3101_3200.s3138_minimum_length_of_anagram_concatenation

// #Medium #String #Hash_Table #Counting #2024_05_07_Time_219_ms_(91.67%)_Space_38.8_MB_(58.33%)

import kotlin.math.sqrt

class Solution {
    fun minAnagramLength(s: String): Int {
        val n = s.length
        val sq = IntArray(n)
        for (i in s.indices) {
            val ch = s[i].code
            if (i == 0) {
                sq[i] = ch * ch
            } else {
                sq[i] = sq[i - 1] + ch * ch
            }
        }
        val factors = getAllFactorsVer2(n)
        factors.sort()
        for (j in factors.indices) {
            val factor = factors[j]
            if (factor == 1) {
                if (sq[0] * n == sq[n - 1]) {
                    return 1
                }
            } else {
                val sum = sq[factor - 1]
                var start = 0
                var i = factor - 1
                while (i < n) {
                    if (start + sum != sq[i]) {
                        break
                    }
                    start += sum
                    if (i == n - 1) {
                        return factor
                    }
                    i += factor
                }
            }
        }
        return n - 1
    }

    private fun getAllFactorsVer2(n: Int): MutableList<Int> {
        val factors: MutableList<Int> = ArrayList()
        var i = 1
        while (i <= sqrt(n.toDouble())) {
            if (n % i == 0) {
                factors.add(i)
                factors.add(n / i)
            }
            i++
        }
        return factors
    }
}
