package g0801_0900.s0858_mirror_reflection

// #Medium #Math #Geometry #2023_04_03_Time_120_ms_(100.00%)_Space_33_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun mirrorReflection(p: Int, q: Int): Int {
        var p = p
        var q = q
        while (p % 2 == 0 && q % 2 == 0) {
            p /= 2
            q /= 2
        }
        return if (p % 2 == 0) {
            2
        } else if (q % 2 == 0) {
            0
        } else {
            1
        }
    }
}
