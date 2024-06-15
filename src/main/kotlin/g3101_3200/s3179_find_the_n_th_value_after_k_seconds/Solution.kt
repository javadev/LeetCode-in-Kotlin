package g3101_3200.s3179_find_the_n_th_value_after_k_seconds

// #Medium #Array #Math #Simulation #Prefix_Sum #Combinatorics
// #2024_06_15_Time_175_ms_(100.00%)_Space_33.2_MB_(100.00%)

import kotlin.math.pow

@Suppress("NAME_SHADOWING")
class Solution {
    private val mod: Int = (10.0.pow(9.0) + 7).toInt()

    fun valueAfterKSeconds(n: Int, k: Int): Int {
        if (n == 1) {
            return 1
        }
        return combination(k + n - 1, k)
    }

    private fun combination(a: Int, b: Int): Int {
        var numerator: Long = 1
        var denominator: Long = 1
        for (i in 0 until b) {
            numerator = (numerator * (a - i)) % mod
            denominator = (denominator * (i + 1)) % mod
        }
        // Calculate the modular inverse of denominator
        val denominatorInverse = power(denominator, mod - 2)
        return ((numerator * denominatorInverse) % mod).toInt()
    }

    // Function to calculate power
    private fun power(x: Long, y: Int): Long {
        var x = x
        var y = y
        var result: Long = 1
        while (y > 0) {
            if (y % 2 == 1) {
                result = (result * x) % mod
            }
            y = y shr 1
            x = (x * x) % mod
        }
        return result
    }
}
