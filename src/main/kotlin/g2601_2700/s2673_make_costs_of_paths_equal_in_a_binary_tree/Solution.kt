package g2601_2700.s2673_make_costs_of_paths_equal_in_a_binary_tree

// #Medium #Array #Dynamic_Programming #Greedy #Tree #Binary_Tree
// #2023_07_26_Time_645_ms_(75.00%)_Space_57.8_MB_(75.00%)

class Solution {
    fun minIncrements(n: Int, cost: IntArray): Int {
        val last = n / 2 - 1
        var res = 0
        for (i in last downTo 0) {
            var abs = cost[2 * i + 1] - cost[2 * i + 2]
            if (abs < 0) abs *= -1
            cost[i] += maxOf(cost[2 * i + 1], cost[2 * i + 2])
            res += abs
        }
        return res
    }
}
