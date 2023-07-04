package g2501_2600.s2543_check_if_point_is_reachable

// #Hard #Math #Number_Theory #2023_07_04_Time_134_ms_(100.00%)_Space_33.3_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun isReachable(targetX: Int, targetY: Int): Boolean {
        val g = gcd(targetX, targetY)
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
