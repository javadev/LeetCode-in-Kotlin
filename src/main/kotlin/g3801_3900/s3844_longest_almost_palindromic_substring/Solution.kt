package g3801_3900.s3844_longest_almost_palindromic_substring

// #Medium #String #Dynamic_Programming #Two_Pointers #Staff #Weekly_Contest_489
// #2026_07_22_Time_10_ms_(99.05%)_Space_44.41_MB_(61.90%)

class Solution {
    private var n = 0
    private lateinit var s: CharArray

    fun almostPalindromic(str: String): Int {
        s = str.toCharArray()
        n = s.size
        var ans = 0
        for (i in 0 until n) {
            ans = maxOf(ans, f(i, i))
            ans = maxOf(ans, f(i, i + 1))
        }
        return ans
    }

    private fun f(l: Int, r: Int): Int {
        var currL = l
        var currR = r
        while (currL >= 0 && currR < n && s[currL] == s[currR]) {
            currL--
            currR++
        }
        var l1 = currL - 1
        var r1 = currR
        var l2 = currL
        var r2 = currR + 1

        while (l1 >= 0 && r1 < n && s[l1] == s[r1]) {
            l1--
            r1++
        }
        while (l2 >= 0 && r2 < n && s[l2] == s[r2]) {
            l2--
            r2++
        }
        return maxOf(r1 - l1 - 1, r2 - l2 - 1).coerceIn(0, n)
    }
}
