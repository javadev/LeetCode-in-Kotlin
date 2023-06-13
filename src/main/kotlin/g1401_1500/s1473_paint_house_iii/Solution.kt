package g1401_1500.s1473_paint_house_iii

// #Hard #Array #Dynamic_Programming #2023_06_13_Time_235_ms_(100.00%)_Space_38.5_MB_(63.64%)

class Solution {
    private lateinit var prev: Array<IntArray>
    private lateinit var curr: Array<IntArray>
    private lateinit var mins: Array<IntArray>

    fun minCost(houses: IntArray, cost: Array<IntArray>, m: Int, n: Int, target: Int): Int {
        prev = Array(n) { IntArray(target) }
        curr = Array(n) { IntArray(target) }
        mins = Array(2) { IntArray(target) }
        for (i in 0 until m) calculate(i, houses, cost, n, target)
        var min = Int.MAX_VALUE
        for (i in 0 until n) min = Math.min(min, curr[i][target - 1])
        return if (min == Int.MAX_VALUE) -1 else min
    }

    private fun calculate(house: Int, houses: IntArray, cost: Array<IntArray>, n: Int, target: Int) {
        swap()
        calculateMins(n, target)
        if (houses[house] > 0) costInPaintedHouse(house, houses, cost, target) else costNotPaintedHouse(
            house,
            houses,
            cost,
            target
        )
    }

    private fun costInPaintedHouse(house: Int, houses: IntArray, cost: Array<IntArray>, target: Int) {
        val color = houses[house] - 1
        for (i in cost[house].indices) {
            val group = Math.min(target - 1, house)
            val newG = house == group
            if (i == color) {
                curr[i][0] = prev[i][0]
                for (j in 1..group) {
                    curr[i][j] = if (mins[0][j - 1] == prev[i][j - 1]) mins[1][j - 1] else mins[0][j - 1]
                    curr[i][j] = if (newG && j == group) curr[i][j] else Math.min(curr[i][j], prev[i][j])
                }
            } else for (j in 0..group) curr[i][j] = Int.MAX_VALUE
        }
    }

    private fun costNotPaintedHouse(house: Int, houses: IntArray, cost: Array<IntArray>, target: Int) {
        for (i in cost[house].indices) {
            val group = Math.min(target - 1, house)
            val newG = house == group
            curr[i][0] = if (prev[i][0] == Int.MAX_VALUE) prev[i][0] else prev[i][0] + cost[house][i]
            for (j in 1..group) {
                curr[i][j] = if (mins[0][j - 1] == prev[i][j - 1]) mins[1][j - 1] else mins[0][j - 1]
                curr[i][j] = if (newG && j == group) curr[i][j] else Math.min(curr[i][j], prev[i][j])
                curr[i][j] = if (curr[i][j] == Int.MAX_VALUE) Int.MAX_VALUE else curr[i][j] + cost[house][i]
            }
        }
    }

    private fun swap() {
        val temp = prev
        prev = curr
        curr = temp
    }

    private fun calculateMins(n: Int, target: Int) {
        for (i in 0 until target - 1) {
            mins[0][i] = prev[0][i]
            mins[1][i] = Int.MAX_VALUE
            for (j in 1 until n) {
                if (prev[j][i] <= mins[0][i]) {
                    mins[1][i] = mins[0][i]
                    mins[0][i] = prev[j][i]
                } else if (prev[j][i] <= mins[1][i]) mins[1][i] = prev[j][i]
            }
        }
    }
}
