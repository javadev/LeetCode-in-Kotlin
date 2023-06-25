package g2101_2200.s2144_minimum_cost_of_buying_candies_with_discount

// #Easy #Array #Sorting #Greedy #2023_06_25_Time_169_ms_(75.00%)_Space_37.1_MB_(100.00%)

class Solution {
    fun minimumCost(cost: IntArray): Int {
        cost.sort()
        var size = 0
        var sum = 0
        for (i in cost.indices.reversed()) {
            size++
            if (size % 3 != 0) {
                sum += cost[i]
            }
        }
        return sum
    }
}
