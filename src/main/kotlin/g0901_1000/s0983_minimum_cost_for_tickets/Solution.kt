package g0901_1000.s0983_minimum_cost_for_tickets

// #Medium #Array #Dynamic_Programming #2023_05_09_Time_147_ms_(92.80%)_Space_35.7_MB_(52.27%)

class Solution {
    fun mincostTickets(days: IntArray, costs: IntArray): Int {
        val memo = IntArray(days.size + 1)
        memo[memo.size - 1] = 0
        for (i in days.indices.reversed()) {
            memo[i] = (costs[0] + memo[getNext(days, i, days[i])]).coerceAtMost(
                costs[1] + memo[
                    getNext(
                        days,
                        i,
                        days[i] + 6
                    )
                ]
            ).coerceAtMost(costs[2] + memo[getNext(days, i, days[i] + 29)])
        }
        return memo[0]
    }

    companion object {
        fun getNext(days: IntArray, index: Int, goodUntil: Int): Int {
            var index = index
            while (index < days.size && days[index] <= goodUntil) {
                index++
            }
            return index
        }
    }
}
