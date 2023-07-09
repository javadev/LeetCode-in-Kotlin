package g2501_2600.s2571_minimum_operations_to_reduce_an_integer_to_0

// #Medium #Dynamic_Programming #Greedy #Bit_Manipulation
// #2023_07_09_Time_131_ms_(100.00%)_Space_32.5_MB_(100.00%)

internal class Solution {
    fun minOperations(n: Int): Int {
        var n = n
        var count = 0
        while (n > 0) {
            val x = kotlin.math.ln(n.toDouble()) / kotlin.math.ln(2.0)
            if (x % 1.0 < 0.5) {
                n = kotlin.math.abs(n - Math.pow(2.0, x.toInt().toDouble()).toInt())
                count++
            } else {
                n = kotlin.math.abs(n - Math.pow(2.0, (x.toInt() + 1).toDouble()).toInt())
                count++
            }
        }
        return count
    }
}
