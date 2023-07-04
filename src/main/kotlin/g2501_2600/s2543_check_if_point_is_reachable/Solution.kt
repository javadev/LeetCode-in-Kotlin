package g2501_2600.s2543_check_if_point_is_reachable

// #Hard #Math #Number_Theory
@Suppress("NAME_SHADOWING")
class Solution {
    fun isReachable(x: Int, y: Int): Boolean {
        val g = gcd(x, y)
        return g and g - 1 == 0
    }

    private fun gcd(x: Int, y: Int): Int {
        var x = x
        var y = y
        while (x != 0) {
            val tmp = x
            x = y % x
            y = tmp
        }
        return y
    }
}
