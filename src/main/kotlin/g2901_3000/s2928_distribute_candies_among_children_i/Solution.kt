package g2901_3000.s2928_distribute_candies_among_children_i

// #Easy #Math #Enumeration #Combinatorics #2024_01_16_Time_141_ms_(86.36%)_Space_33.8_MB_(86.36%)

import kotlin.math.min

class Solution {
    fun distributeCandies(n: Int, limit: Int): Int {
        var count = 0
        for (i in 0 until min(limit, n) + 1) {
            for (j in 0 until min(limit, n) + 1) {
                val k = n - i - j
                if (k >= 0 && k <= limit) {
                    count++
                }
            }
        }
        return count
    }
}
