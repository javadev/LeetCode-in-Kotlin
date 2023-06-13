package g1501_1600.s1578_minimum_time_to_make_rope_colorful

// #Medium #Array #String #Dynamic_Programming #Greedy
class Solution {
    fun minCost(s: String, cost: IntArray): Int {
        val str = s.toCharArray()
        var minCost = 0
        for (i in 1 until str.size) {
            if (str[i] == str[i - 1]) {
                // accrue the cost of deletion for the lower duplicate
                minCost += Math.min(cost[i], cost[i - 1])
                // keep the cost of the higher duplicate for next iteration
                cost[i] = Math.max(cost[i], cost[i - 1])
            }
        }
        return minCost
    }
}
