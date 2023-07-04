package g2401_2500.s2484_count_palindromic_subsequences

// #Hard #String #Dynamic_Programming
class Solution {
    fun countPalindromes(s: String): Int {
        val n = s.length
        var ans: Long = 0
        val mod = 1e9.toInt() + 7
        val count = IntArray(10)
        for (i in 0 until n) {
            var m: Long = 0
            for (j in n - 1 downTo i + 1) {
                if (s[i] == s[j]) {
                    ans += m * (j - i - 1)
                    ans = ans % mod
                }
                m += count[s[j].code - '0'.code].toLong()
            }
            count[s[i].code - '0'.code]++
        }
        return ans.toInt()
    }
}
