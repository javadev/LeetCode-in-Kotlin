package g3001_3100.s3001_minimum_moves_to_capture_the_queen

// #Medium #Array #Enumeration #2024_02_25_Time_128_ms_(94.59%)_Space_33.7_MB_(83.78%)

import kotlin.math.abs

class Solution {
    fun minMovesToCaptureTheQueen(a: Int, b: Int, c: Int, d: Int, e: Int, f: Int): Int {
        if (a == e || b == f) {
            if (a == c && (d > b && d < f || d > f && d < b)) {
                return 2
            }
            if (b == d && (c > a && c < e || c > e && c < a)) {
                return 2
            }
            return 1
        } else if (abs((c - e).toDouble()) == abs((d - f).toDouble())) {
            if (abs((a - c).toDouble()) == abs((b - d).toDouble()) && abs((e - a).toDouble()) == abs((f - b).toDouble()) && (a > e && a < c || a > c && a < e)) {
                return 2
            }
            return 1
        }
        return 2
    }
}
