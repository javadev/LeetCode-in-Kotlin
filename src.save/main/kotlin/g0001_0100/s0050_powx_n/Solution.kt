package g0001_0100.s0050_powx_n

// #Medium #Top_Interview_Questions #Math #Recursion #Udemy_Integers
// #2023_07_05_Time_172_ms_(38.68%)_Space_34.8_MB_(66.04%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun myPow(x: Double, n: Int): Double {
        var x = x
        var nn = n.toLong()
        var res = 1.0
        if (n < 0) {
            nn *= -1
        }
        while (nn > 0) {
            if (nn % 2 == 1L) {
                nn--
                res *= x
            } else {
                x *= x
                nn /= 2
            }
        }
        return if (n < 0) {
            1.0 / res
        } else res
    }
}
