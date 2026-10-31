package g3701_3800.s3783_mirror_distance_of_an_integer

// #Easy #Math #Mid_Level #Weekly_Contest_481 #2026_05_22_Time_1_ms_(99.88%)_Space_42.74_MB_(18.96%)

import kotlin.math.abs

class Solution {
    private fun rev(n: Int): Int {
        var n = n
        var a = 0
        while (n > 0) {
            a = a * 10 + (n % 10)
            n /= 10
        }
        return a
    }

    fun mirrorDistance(n: Int): Int {
        val m = rev(n)
        return abs(m - n)
    }
}
