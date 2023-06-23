package g2101_2200.s2144_minimum_cost_of_buying_candies_with_discount

// #Easy #Array #Sorting #Greedy
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
