package g1501_1600.s1578_minimum_time_to_make_rope_colorful

// #Medium #Array #String #Dynamic_Programming #Greedy
// #2023_06_14_Time_577_ms_(100.00%)_Space_53.8_MB_(100.00%)

class Solution {
    fun minCost(colors: String, neededTime: IntArray): Int {
        val str = colors.toCharArray()
        var minCost = 0
        for (i in 1 until str.size) {
            if (str[i] == str[i - 1]) {
                // accrue the cost of deletion for the lower duplicate
                minCost += Math.min(neededTime[i], neededTime[i - 1])
                // keep the cost of the higher duplicate for next iteration
                neededTime[i] = Math.max(neededTime[i], neededTime[i - 1])
            }
        }
        return minCost
    }
}
