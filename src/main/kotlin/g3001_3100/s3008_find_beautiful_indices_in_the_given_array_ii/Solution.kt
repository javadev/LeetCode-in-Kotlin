package g3001_3100.s3008_find_beautiful_indices_in_the_given_array_ii

// #Hard #String #Binary_Search #Two_Pointers #Hash_Function #String_Matching #Rolling_Hash
// #2024_02_28_Time_730_ms_(96.67%)_Space_68.7_MB_(76.67%)

import java.util.ArrayDeque
import java.util.Deque
import kotlin.math.abs

class Solution {
    fun beautifulIndices(s: String, a: String, b: String, k: Int): List<Int> {
        val lpsA = getLps(a)
        val lpsB = getLps(b)
        val ans: MutableList<Int> = ArrayList()
        val matchesA: Deque<Int> = ArrayDeque()
        val n = s.length
        val aLen = a.length
        val bLen = b.length
        var i = 0
        var j = 0
        while (i < n) {
            if (s[i] == a[j]) {
                i++
                j++
            } else {
                if (j == 0) {
                    i++
                } else {
                    j = lpsA[j - 1]
                }
            }
            if (j == aLen) {
                val aStart = i - aLen
                matchesA.offer(aStart)
                j = lpsA[aLen - 1]
            }
        }
        j = 0
        i = j
        while (i < n && matchesA.isNotEmpty()) {
            if (s[i] == b[j]) {
                i++
                j++
            } else {
                if (j == 0) {
                    i++
                } else {
                    j = lpsB[j - 1]
                }
            }
            if (j == bLen) {
                val bStart = i - bLen
                j = lpsB[bLen - 1]

                while (matchesA.isNotEmpty() && bStart - matchesA.peek() > k) {
                    matchesA.poll()
                }
                while (matchesA.isNotEmpty() && abs((matchesA.peek() - bStart).toDouble()) <= k) {
                    ans.add(matchesA.poll())
                }
            }
        }
        return ans
    }

    private fun getLps(s: String): IntArray {
        val n = s.length
        val lps = IntArray(n)
        var i = 1
        var prevLps = 0
        while (i < n) {
            if (s[i] == s[prevLps]) {
                prevLps++
                lps[i++] = prevLps
            } else {
                if (prevLps == 0) {
                    lps[i++] = 0
                } else {
                    prevLps = lps[prevLps - 1]
                }
            }
        }
        return lps
    }
}
