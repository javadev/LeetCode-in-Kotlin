package g3801_3900.s3844_longest_almost_palindromic_substring

// #Medium #String #Dynamic_Programming #Two_Pointers #Staff #Weekly_Contest_489
// #2026_07_22_Time_10_ms_(99.05%)_Space_44.41_MB_(61.90%)

import kotlin.math.max

class Solution {
    private var n = 0
    private lateinit var s: CharArray

    fun almostPalindromic(str: String): Int {
        s = str.toCharArray()
        n = s.size
        var ans = 0
        for (i in 0..<n) {
            ans = max(ans, f(i, i))
            ans = max(ans, f(i, i + 1))
        }
        return ans
    }

    private fun f(l: Int, r: Int): Int {
        var l = l
        var r = r
        while (l >= 0 && r < n && s[l] == s[r]) {
            l--
            r++
        }
        var l1 = l - 1
        var r1 = r
        var l2 = l
        var r2 = r + 1
        while (l1 >= 0 && r1 < n && s[l1] == s[r1]) {
            l1--
            r1++
        }
        while (l2 >= 0 && r2 < n && s[l2] == s[r2]) {
            l2--
            r2++
        }
        return Math.clamp(max(r1 - l1 - 1, r2 - l2 - 1).toLong(), 0, n)
    }
}
