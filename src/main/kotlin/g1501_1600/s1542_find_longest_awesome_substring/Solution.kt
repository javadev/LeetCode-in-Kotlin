package g1501_1600.s1542_find_longest_awesome_substring

import java.util.*

// #Hard #String #Hash_Table #Bit_Manipulation
class Solution {
    fun longestAwesome(s: String): Int {
        val n = s.length
        val idx = IntArray(Math.pow(2.0, 10.0).toInt())
        Arrays.fill(idx, Int.MAX_VALUE)
        idx[0] = -1
        var mask = 0
        var ans = 0
        for (i in 0 until n) {
            mask = mask xor (1 shl s[i].code - '0'.code)
            ans = Math.max(ans, i - idx[mask])
            for (j in 0..9) {
                ans = Math.max(ans, i - idx[mask xor (1 shl j)])
            }
            idx[mask] = Math.min(idx[mask], i)
        }
        return ans
    }
}
