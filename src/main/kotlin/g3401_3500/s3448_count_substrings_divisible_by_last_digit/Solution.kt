package g3401_3500.s3448_count_substrings_divisible_by_last_digit

// #Hard #String #Dynamic_Programming #2025_02_11_Time_29_ms_(77.78%)_Space_41.05_MB_(77.78%)

class Solution {
    fun countSubstrings(s: String): Long {
        val n = s.length
        val p3 = IntArray(n)
        val p7 = IntArray(n)
        val p9 = IntArray(n)
        computeModArrays(s, p3, p7, p9)
        val freq3 = LongArray(3)
        val freq9 = LongArray(9)
        val freq7 = Array<LongArray?>(6) { LongArray(7) }
        val inv7 = intArrayOf(1, 5, 4, 6, 2, 3)
        return countValidSubstrings(s, p3, p7, p9, freq3, freq9, freq7, inv7)
    }

    private fun computeModArrays(s: String, p3: IntArray, p7: IntArray, p9: IntArray) {
        p3[0] = (s.get(0).code - '0'.code) % 3
        p7[0] = (s.get(0).code - '0'.code) % 7
        p9[0] = (s.get(0).code - '0'.code) % 9
        for (i in 1..<s.length) {
            val dig = s.get(i).code - '0'.code
            p3[i] = (p3[i - 1] * 10 + dig) % 3
            p7[i] = (p7[i - 1] * 10 + dig) % 7
            p9[i] = (p9[i - 1] * 10 + dig) % 9
        }
    }

    private fun countValidSubstrings(
        s: String,
        p3: IntArray,
        p7: IntArray,
        p9: IntArray,
        freq3: LongArray,
        freq9: LongArray,
        freq7: Array<LongArray?>,
        inv7: IntArray,
    ): Long {
        var ans: Long = 0
        for (j in 0..<s.length) {
            val d = s.get(j).code - '0'.code
            if (d != 0) {
                ans += countDivisibilityCases(s, j, d, p3, p7, p9, freq3, freq9, freq7, inv7)
            }
            freq3[p3[j]]++
            freq7[j % 6]!![p7[j]] = freq7[j % 6]!![p7[j]] + 1
            freq9[p9[j]]++
        }
        return ans
    }

    private fun countDivisibilityCases(
        s: String,
        j: Int,
        d: Int,
        p3: IntArray,
        p7: IntArray,
        p9: IntArray,
        freq3: LongArray,
        freq9: LongArray,
        freq7: Array<LongArray?>,
        inv7: IntArray,
    ): Long {
        var ans: Long = 0
        if (d == 1 || d == 2 || d == 5) {
            ans += (j + 1).toLong()
        } else if (d == 4) {
            ans += countDivisibilityBy4(s, j)
        } else if (d == 8) {
            ans += countDivisibilityBy8(s, j)
        } else if (d == 3 || d == 6) {
            ans += (if (p3[j] == 0) 1L else 0L) + freq3[p3[j]]
        } else if (d == 7) {
            ans += countDivisibilityBy7(j, p7, freq7, inv7)
        } else if (d == 9) {
            ans += (if (p9[j] == 0) 1L else 0L) + freq9[p9[j]]
        }
        return ans
    }

    private fun countDivisibilityBy4(s: String, j: Int): Long {
        if (j == 0) {
            return 1
        }
        val num = (s.get(j - 1).code - '0'.code) * 10 + (s.get(j).code - '0'.code)
        return (if (num % 4 == 0) j + 1 else 1).toLong()
    }

    private fun countDivisibilityBy8(s: String, j: Int): Long {
        if (j == 0) {
            return 1
        }
        if (j == 1) {
            val num = (s.get(0).code - '0'.code) * 10 + 8
            return (if (num % 8 == 0) 2 else 1).toLong()
        }
        val num3 = (s.get(j - 2).code - '0'.code) * 100 + (s.get(j - 1).code - '0'.code) * 10 + 8
        val num2 = (s.get(j - 1).code - '0'.code) * 10 + 8
        return (if (num3 % 8 == 0) j - 1 else 0) + (if (num2 % 8 == 0) 1 else 0) + 1L
    }

    private fun countDivisibilityBy7(j: Int, p7: IntArray, freq7: Array<LongArray?>, inv7: IntArray): Long {
        var ans = (if (p7[j] == 0) 1L else 0L)
        for (m in 0..5) {
            val idx = ((j % 6) - m + 6) % 6
            val req = (p7[j] * inv7[m]) % 7
            ans += freq7[idx]!![req]
        }
        return ans
    }
}
