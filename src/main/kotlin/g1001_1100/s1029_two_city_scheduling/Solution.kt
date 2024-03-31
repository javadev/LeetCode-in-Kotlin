package g1001_1100.s1029_two_city_scheduling

// #Medium #Array #Sorting #Greedy #2023_05_24_Time_148_ms_(100.00%)_Space_35.4_MB_(92.31%)

class Solution {
    fun twoCitySchedCost(costs: Array<IntArray>): Int {
        costs.sortWith { a: IntArray, b: IntArray ->
            a[0] - a[1] - (b[0] - b[1])
        }
        var cost = 0
        for (i in costs.indices) {
            cost += if (i < costs.size / 2) {
                costs[i][0]
            } else {
                costs[i][1]
            }
        }
        return cost
    }
}
