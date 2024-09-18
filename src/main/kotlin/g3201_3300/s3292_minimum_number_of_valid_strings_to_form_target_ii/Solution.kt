package g3201_3300.s3292_minimum_number_of_valid_strings_to_form_target_ii

// #Hard #Array #String #Dynamic_Programming #Binary_Search #Segment_Tree #Hash_Function
// #String_Matching #Rolling_Hash #2024_09_17_Time_674_ms_(50.00%)_Space_74.6_MB_(100.00%)

import java.util.ArrayList
import kotlin.math.min

class Solution {
    fun minValidStrings(words: Array<String>, target: String): Int {
        val n = target.length
        val dp = IntArray(n + 1)
        dp.fill(Int.Companion.MAX_VALUE)
        dp[0] = 0
        val matches: MutableList<MutableList<Int>> = ArrayList<MutableList<Int>>(n)
        for (i in 0 until n) {
            matches.add(ArrayList<Int>())
        }
        val targetChars = target.toCharArray()
        for (word in words) {
            val wordChars = word.toCharArray()
            val m = wordChars.size
            val pi = IntArray(m)
            var i1 = 1
            var j1 = 0
            while (i1 < m) {
                while (j1 > 0 && wordChars[i1] != wordChars[j1]) {
                    j1 = pi[j1 - 1]
                }
                if (wordChars[i1] == wordChars[j1]) {
                    j1++
                }
                pi[i1] = j1
                i1++
            }
            var i = 0
            var j = 0
            while (i < n) {
                while (j > 0 && targetChars[i] != wordChars[j]) {
                    j = pi[j - 1]
                }
                if (targetChars[i] == wordChars[j]) {
                    j++
                }
                if (j > 0) {
                    matches[i - j + 1].add(j)
                    if (j == m) {
                        j = pi[j - 1]
                    }
                }
                i++
            }
        }
        for (i in 0 until n) {
            if (dp[i] == Int.Companion.MAX_VALUE) {
                continue
            }
            for (len in matches[i]) {
                if (i + len <= n) {
                    dp[i + len] = min(dp[i + len], (dp[i] + 1))
                }
            }
        }
        return if (dp[n] == Int.Companion.MAX_VALUE) -1 else dp[n]
    }
}
