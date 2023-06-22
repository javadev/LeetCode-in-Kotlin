package g1801_1900.s1900_the_earliest_and_latest_rounds_where_players_compete

// #Hard #Dynamic_Programming #Memoization #2023_06_22_Time_142_ms_(100.00%)_Space_33.6_MB_(100.00%)

class Solution {
    fun earliestAndLatest(n: Int, firstPlayer: Int, secondPlayer: Int): IntArray {
        var p1 = Math.min(firstPlayer, secondPlayer)
        var p2 = Math.max(firstPlayer, secondPlayer)
        if (p1 + p2 == n + 1) {
            // p1 and p2 compete in the first round
            return intArrayOf(1, 1)
        }
        if (n == 3 || n == 4) {
            // p1 and p2 must compete in the second round (only two rounds).
            return intArrayOf(2, 2)
        }
        // Flip to make p1 be more closer to left than p2 to right end for convenience
        if (p1 - 1 > n - p2) {
            val t = n + 1 - p1
            p1 = n + 1 - p2
            p2 = t
        }
        val m = (n + 1) / 2
        var min = n
        var max = 1
        if (p2 * 2 <= n + 1) {
            // p2 is in first half (n odd or even) or exact middle (n odd)
            //   1  2  3  4  5  6  7  8  9 10 11 12 13 14
            //   .  .  *  .  .  *  .  .  .  .  .  .  .  .
            //         ^        ^
            //         p1       p2
            // Group A are players in front of p1
            // Group B are players between p1 and p2
            val a = p1 - 1
            val b = p2 - p1 - 1
            // i represents number of front players in A wins
            // j represents number of front players in B wins
            for (i in 0..a) {
                for (j in 0..b) {
                    val ret = earliestAndLatest(m, i + 1, i + j + 2)
                    min = Math.min(min, 1 + ret[0])
                    max = Math.max(max, 1 + ret[1])
                }
            }
        } else {
            // p2 is in the later half (and has >= p1 distance to the end)
            //    1  2  3  4  5  6  7  8  9 10 11 12 13 14
            //    .  .  *  .  .  .  .  .  .  *  .  .  .  .
            //          ^                    ^
            //          p1   p4             p2    p3
            //                ^--------------^
            //          ^--------------------------^
            val p4 = n + 1 - p2
            val a = p1 - 1
            val b = p4 - p1 - 1
            // Group C are players between p4 and p2, (c+1)/2 will advance to next round.
            val c = p2 - p4 - 1
            for (i in 0..a) {
                for (j in 0..b) {
                    val ret = earliestAndLatest(m, i + 1, i + j + 1 + (c + 1) / 2 + 1)
                    min = Math.min(min, 1 + ret[0])
                    max = Math.max(max, 1 + ret[1])
                }
            }
        }
        return intArrayOf(min, max)
    }
}
