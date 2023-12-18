package g2801_2900.s2850_minimum_moves_to_spread_stones_over_grid

// #Medium #Array #Dynamic_Programming #Breadth_First_Search #Matrix
// #2023_12_18_Time_133_ms_(100.00%)_Space_34.6_MB_(100.00%)

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

class Solution {
    fun minimumMoves(grid: Array<IntArray>): Int {
        val a = grid[0][0] - 1
        val b = grid[0][1] - 1
        val c = grid[0][2] - 1
        val d = grid[1][0] - 1
        val f = grid[1][2] - 1
        val g = grid[2][0] - 1
        val h = grid[2][1] - 1
        val i = grid[2][2] - 1
        var minCost = Int.MAX_VALUE
        for (x in min(a, 0)..max(a, 0)) {
            for (y in min(c, 0)..max(c, 0)) {
                for (z in min(i, 0)..max(i, 0)) {
                    for (t in min(g, 0)..max(g, 0)) {
                        val cost: Int =
                            abs(x) + abs(y) + abs(z) + abs(t) + abs((x - a)) + abs(
                                (y - c)
                            ) + abs((z - i)) + abs((t - g)) + abs((x - y + b + c)) + abs(
                                (y - z + i + f)
                            ) + abs((z - t + g + h)) + abs((t - x + a + d))
                        if (cost < minCost) {
                            minCost = cost
                        }
                    }
                }
            }
        }
        return minCost
    }
}
