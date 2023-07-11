package g2501_2600.s2582_pass_the_pillow

// #Easy #Math #Simulation #2023_07_11_Time_122_ms_(85.71%)_Space_32.3_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun passThePillow(n: Int, time: Int): Int {
        var time = time
        time %= ((n - 1) * 2)
        return n - kotlin.math.abs(n - 1 - time)
    }
}
