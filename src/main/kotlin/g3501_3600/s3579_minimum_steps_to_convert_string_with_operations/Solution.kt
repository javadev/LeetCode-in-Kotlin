package g3501_3600.s3579_minimum_steps_to_convert_string_with_operations

// #Hard #2025_06_08_Time_74_ms_(100.00%)_Space_48.31_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun minOperations(word1: String, word2: String): Int {
        val dp = IntArray(word1.length)
        val count: Array<IntArray> = Array<IntArray>(26) { IntArray(26) }
        for (i in 0..<word1.length) {
            dp[i] = Int.Companion.MAX_VALUE
        }
        for (i in 0..<word1.length) {
            for (j in i downTo 0) {
                var c1 = 0
                var c2 = 0
                run {
                    var k1 = j
                    var k2 = j
                    while (k1 <= i && k2 <= i) {
                        val ints = count[word2[k2].code - 'a'.code]
                        if (ints[word1[k1].code - 'a'.code] > 0) {
                            ints[word1[k1].code - 'a'.code]--
                        } else if (word1[k1] != word2[k2]) {
                            count[word1[k1].code - 'a'.code][word2[k2].code - 'a'.code]++
                            c1++
                        }
                        k1++
                        k2++
                    }
                }
                run {
                    var k1 = j
                    var k2 = j
                    while (k1 <= i && k2 <= i) {
                        count[word1[k1].code - 'a'.code][word2[k2].code - 'a'.code] = 0
                        k1++
                        k2++
                    }
                }
                dp[i] = min(dp[i], if (j - 1 < 0) c1 else dp[j - 1] + c1)
                run {
                    var k1 = j
                    var k2 = i
                    while (k1 <= i && k2 >= j) {
                        val ints = count[word2[k2].code - 'a'.code]
                        if (ints[word1[k1].code - 'a'.code] > 0) {
                            ints[word1[k1].code - 'a'.code]--
                        } else if (word1[k1].code - 'a'.code != word2[k2].code - 'a'.code) {
                            count[word1[k1].code - 'a'.code][word2[k2].code - 'a'.code]++
                            c2++
                        }
                        k1++
                        k2--
                    }
                }
                var k1 = j
                var k2 = i
                while (k1 <= i && k2 >= j) {
                    count[word1[k1].code - 'a'.code][word2[k2].code - 'a'.code] = 0
                    k1++
                    k2--
                }
                dp[i] = min(dp[i], if (j - 1 < 0) c2 + 1 else dp[j - 1] + c2 + 1)
            }
        }
        return dp[word1.length - 1]
    }
}
