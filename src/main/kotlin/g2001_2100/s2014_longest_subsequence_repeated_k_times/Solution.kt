package g2001_2100.s2014_longest_subsequence_repeated_k_times

// #Hard #String #Greedy #Backtracking #Counting #Enumeration
@Suppress("NAME_SHADOWING")
class Solution {
    fun longestSubsequenceRepeatedK(s: String, k: Int): String {
        val ca = s.toCharArray()
        val freq = CharArray(26)
        for (value in ca) {
            ++freq[value.code - 'a'.code]
        }
        val cand: Array<ArrayList<String>?> = arrayOfNulls(8)
        cand[1] = ArrayList()
        var ans = ""
        for (i in 0..25) {
            if (freq[i].code >= k) {
                ans = "" + ('a'.code + i).toChar()
                cand[1]?.add(ans)
            }
        }
        for (i in 2..7) {
            cand[i] = ArrayList()
            for (prev in cand[i - 1]!!) {
                for (c in cand[1]!!) {
                    val next = prev + c
                    if (isSubsequenceRepeatedK(ca, next, k)) {
                        ans = next
                        cand[i]?.add(ans)
                    }
                }
            }
        }
        return ans
    }

    private fun isSubsequenceRepeatedK(ca: CharArray, t: String, k: Int): Boolean {
        var k = k
        val ta = t.toCharArray()
        val n = ca.size
        val m = ta.size
        var i = 0
        while (k-- > 0) {
            var j = 0
            while (i < n && j < m) {
                if (ca[i] == ta[j]) {
                    j++
                }
                i++
            }
            if (j != m) {
                return false
            }
        }
        return true
    }
}
