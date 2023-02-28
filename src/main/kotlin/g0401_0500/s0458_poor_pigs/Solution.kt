package g0401_0500.s0458_poor_pigs

// #Hard #Dynamic_Programming #Math #Combinatorics
// #2022_12_27_Time_133_ms_(80.00%)_Space_32.8_MB_(80.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun poorPigs(buckets: Int, minutesToDie: Int, minutesToTest: Int): Int {
        var buckets = buckets
        if (buckets-- == 1) {
            return 0
        }
        val base = minutesToTest / minutesToDie + 1
        var count = 0
        while (buckets > 0) {
            buckets /= base
            count++
        }
        return count
    }
}
