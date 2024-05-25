package g3101_3200.s3154_find_number_of_ways_to_reach_the_k_th_stair

// #Hard #Dynamic_Programming #Math #Bit_Manipulation #Memoization #Combinatorics
// #2024_05_25_Time_122_ms_(100.00%)_Space_33.6_MB_(96.55%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun waysToReachStair(k: Int): Int {
        var x = 1
        var y = 1
        var a = 0
        while (x > 0 && x - y <= k) {
            if (x >= k) {
                a += combi(y, x - k)
            }
            x = x shl 1
            y++
        }
        return a
    }

    private fun combi(a: Int, b: Int): Int {
        var b = b
        if (b > a - b) {
            b = a - b
        }
        var r: Long = 1
        for (i in 0 until b) {
            r *= (a - i).toLong()
            r /= (i + 1).toLong()
        }
        return r.toInt()
    }
}
