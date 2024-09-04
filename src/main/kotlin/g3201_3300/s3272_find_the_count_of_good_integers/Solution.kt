package g3201_3300.s3272_find_the_count_of_good_integers

// #Hard #Hash_Table #Math #Enumeration #Combinatorics
// #2024_09_04_Time_452_ms_(80.00%)_Space_53.5_MB_(60.00%)

import kotlin.math.max

class Solution {
    private val palindromes: MutableList<String> = ArrayList()

    private fun factorial(n: Int): Long {
        var res: Long = 1
        for (i in 2..n) {
            res *= i.toLong()
        }
        return res
    }

    private fun countDigits(s: String): MutableMap<Char, Int> {
        val freq: MutableMap<Char, Int> = HashMap()
        for (c in s.toCharArray()) {
            freq[c] = freq.getOrDefault(c, 0) + 1
        }
        return freq
    }

    private fun calculatePermutations(freq: Map<Char, Int>, length: Int): Long {
        var totalPermutations = factorial(length)
        for (count in freq.values) {
            totalPermutations /= factorial(count)
        }
        return totalPermutations
    }

    private fun calculateValidPermutations(s: String): Long {
        val freq = countDigits(s)
        val n = s.length
        var totalPermutations = calculatePermutations(freq, n)
        if (freq.getOrDefault('0', 0) > 0) {
            freq['0'] = freq['0']!! - 1
            val invalidPermutations = calculatePermutations(freq, n - 1)
            totalPermutations -= invalidPermutations
        }
        return totalPermutations
    }

    private fun generatePalindromes(
        f: Int,
        r: Int,
        k: Int,
        lb: Int,
        sum: Int,
        ans: StringBuilder,
        rem: IntArray
    ) {
        if (f > r) {
            if (sum == 0) {
                palindromes.add(ans.toString())
            }
            return
        }
        for (i in lb..9) {
            ans.setCharAt(f, ('0'.code + i).toChar())
            ans.setCharAt(r, ('0'.code + i).toChar())
            var chk = sum
            chk = (chk + rem[f] * i) % k
            if (f != r) {
                chk = (chk + rem[r] * i) % k
            }
            generatePalindromes(f + 1, r - 1, k, 0, chk, ans, rem)
        }
    }

    private fun allKPalindromes(n: Int, k: Int): List<String> {
        val ans = StringBuilder(n)
        ans.append("0".repeat(max(0.0, n.toDouble()).toInt()))
        val rem = IntArray(n)
        rem[0] = 1
        for (i in 1 until n) {
            rem[i] = (rem[i - 1] * 10) % k
        }
        palindromes.clear()
        generatePalindromes(0, n - 1, k, 1, 0, ans, rem)
        return palindromes
    }

    fun countGoodIntegers(n: Int, k: Int): Long {
        val ans = allKPalindromes(n, k)
        val st: MutableSet<String> = HashSet()
        for (str in ans) {
            val arr = str.toCharArray()
            arr.sort()
            st.add(String(arr))
        }
        val v: List<String> = ArrayList(st)
        var chk: Long = 0
        for (str in v) {
            val cc = calculateValidPermutations(str)
            chk += cc
        }
        return chk
    }
}
