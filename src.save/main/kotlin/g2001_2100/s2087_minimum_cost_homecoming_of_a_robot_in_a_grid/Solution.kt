package g2001_2100.s2087_minimum_cost_homecoming_of_a_robot_in_a_grid

// #Medium #Array #Greedy #Matrix #2023_06_27_Time_672_ms_(100.00%)_Space_61.5_MB_(100.00%)

class Solution {
    fun minCost(startPos: IntArray, homePos: IntArray, rowCosts: IntArray, colCosts: IntArray): Int {
        val sx = startPos[0]
        val sy = startPos[1]
        val ex = homePos[0]
        val ey = homePos[1]
        if (sx == ex && sy == ey) {
            return 0
        }
        var total = 0
        if (sx < ex) {
            var i = sx
            while (i < ex) {
                i++
                total += rowCosts[i]
            }
        } else {
            var i = sx
            while (i > ex) {
                i--
                total += rowCosts[i]
            }
        }
        if (sy < ey) {
            var i = sy
            while (i < ey) {
                i++
                total += colCosts[i]
            }
        } else {
            var i = sy
            while (i > ey) {
                i--
                total += colCosts[i]
            }
        }
        return total
    }
}
