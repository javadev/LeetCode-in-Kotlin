package g0001_0100.s0010_regular_expression_matching

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #String #Dynamic_Programming #Recursion

class Solution {
    private lateinit var cache: Array<Array<Boolean?>>

    fun isMatch(s: String, p: String): Boolean {
        cache = Array(s.length + 1) { arrayOfNulls(p.length + 1) }
        return isMatch(s, p, 0, 0)
    }

    private fun isMatch(s: String, p: String, i: Int, j: Int): Boolean {
        if (j == p.length) {
            return i == s.length
        }
        val result: Boolean
        if (cache[i][j] != null) {
            return cache[i][j]!!
        }
        val firstMatch = i < s.length && (s[i] == p[j] || p[j] == '.')
        result = if (j + 1 < p.length && p[j + 1] == '*') {
            firstMatch && isMatch(s, p, i + 1, j) || isMatch(s, p, i, j + 2)
        } else {
            firstMatch && isMatch(s, p, i + 1, j + 1)
        }
        cache[i][j] = result
        return result
    }
}
