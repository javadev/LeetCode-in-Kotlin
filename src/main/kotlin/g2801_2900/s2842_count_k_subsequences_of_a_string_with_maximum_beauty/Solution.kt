package g2801_2900.s2842_count_k_subsequences_of_a_string_with_maximum_beauty

// #Hard #String #Hash_Table #Math #Greedy #Combinatorics
// #2023_12_18_Time_217_ms_(100.00%)_Space_43.7_MB_(25.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun countKSubsequencesWithMaxBeauty(s: String, k: Int): Int {
        var k = k
        val n = s.length
        val count = IntArray(26)
        for (i in 0 until n) {
            count[s[i].code - 'a'.code]++
        }
        count.sort()
        if (k > 26 || count[26 - k] == 0) {
            return 0
        }
        var res: Long = 1
        var comb: Long = 1
        val mod = 1e9.toLong() + 7
        val bar = count[26 - k].toLong()
        var pend: Long = 0
        for (freq in count) {
            if (freq > bar) {
                k--
                res = res * freq % mod
            }
            if (freq.toLong() == bar) {
                pend++
            }
        }
        for (i in 0 until k) {
            comb = comb * (pend - i) / (i + 1)
            res = res * bar % mod
        }
        return (res * comb % mod).toInt()
    }
}
