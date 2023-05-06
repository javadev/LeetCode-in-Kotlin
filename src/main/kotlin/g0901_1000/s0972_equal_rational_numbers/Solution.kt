package g0901_1000.s0972_equal_rational_numbers

// #Hard #String #Math #2023_05_06_Time_130_ms_(100.00%)_Space_35.4_MB_(50.00%)

import kotlin.math.abs
import kotlin.math.pow

class Solution {
    fun isRationalEqual(s: String, t: String): Boolean {
        return abs(valueOf(s) - valueOf(t)) < 1e-9
    }
    private val ratios = doubleArrayOf(1.0, 1.0 / 9, 1.0 / 99, 1.0 / 999, 1.0 / 9999)
    private fun valueOf(s: String): Double {
        if (!s.contains("(")) return java.lang.Double.valueOf(s)
        val integerNonRepeating = java.lang.Double.valueOf(s.substring(0, s.indexOf('(')))
        val nonRepeatingLength = s.indexOf('(') - s.indexOf('.') - 1
        val repeating = s.substring(s.indexOf('(') + 1, s.indexOf(')')).toInt()
        val repeatingLength = s.indexOf(')') - s.indexOf('(') - 1
        return integerNonRepeating +
            repeating * 0.1.pow(nonRepeatingLength.toDouble()) * ratios[repeatingLength]
    }
}
