package g0001_0100.s0097_interleaving_string

// #Medium #String #Dynamic_Programming #Top_Interview_150_Multidimensional_DP
// #2023_07_10_Time_149_ms_(81.58%)_Space_33.8_MB_(97.37%)

class Solution {
    fun isInterleave(s1: String, s2: String, s3: String): Boolean {
        if (s3.length != s1.length + s2.length) {
            return false
        }
        val cache = Array(s1.length + 1) { arrayOfNulls<Boolean>(s2.length + 1) }
        return isInterleave(s1, s2, s3, 0, 0, 0, cache)
    }

    fun isInterleave(
        s1: String,
        s2: String,
        s3: String,
        i1: Int,
        i2: Int,
        i3: Int,
        cache: Array<Array<Boolean?>>,
    ): Boolean {
        if (cache[i1][i2] != null) {
            return cache[i1][i2]!!
        }
        if (i1 == s1.length && i2 == s2.length && i3 == s3.length) {
            return true
        }
        var result = false
        if (i1 < s1.length && s1[i1] == s3[i3]) {
            result = isInterleave(s1, s2, s3, i1 + 1, i2, i3 + 1, cache)
        }
        if (i2 < s2.length && s2[i2] == s3[i3]) {
            result = result || isInterleave(s1, s2, s3, i1, i2 + 1, i3 + 1, cache)
        }
        cache[i1][i2] = result
        return result
    }
}
