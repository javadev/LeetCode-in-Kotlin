package g3001_3100.s3001_minimum_moves_to_capture_the_queen

// #Medium #Array #Enumeration #2024_11_09_Time_1_ms_(100.00%)_Space_34.2_MB_(50.00%)

import kotlin.math.abs

class Solution {
    fun minMovesToCaptureTheQueen(a: Int, b: Int, c: Int, d: Int, e: Int, f: Int): Int {
        if (a == e || b == f) {
            if (a == e && a == c && (d - b) * (d - f) < 0) {
                return 2
            }
            if (b == f && b == d && (c - a) * (c - e) < 0) {
                return 2
            }
            return 1
        }
        if (abs(c - e) == abs(d - f)) {
            if (abs(c - a) == abs(d - b) && (b - f) * (b - d) < 0) {
                return 2
            }
            return 1
        }
        return 2
    }
}
