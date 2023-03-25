package g0801_0900.s0826_most_profit_assigning_work

// #Medium #Array #Sorting #Greedy #Binary_Search #Two_Pointers #Binary_Search_II_Day_11
// #2023_03_25_Time_366_ms_(100.00%)_Space_42.9_MB_(83.33%)

class Solution {
    fun maxProfitAssignment(difficulty: IntArray, profit: IntArray, worker: IntArray): Int {
        val n = 100000
        val maxProfit = IntArray(n)
        for (i in difficulty.indices) {
            maxProfit[difficulty[i]] = maxProfit[difficulty[i]].coerceAtLeast(profit[i])
        }
        for (i in 1 until n) {
            maxProfit[i] = maxProfit[i].coerceAtLeast(maxProfit[i - 1])
        }
        var sum = 0
        for (efficiency in worker) {
            sum += maxProfit[efficiency]
        }
        return sum
    }
}
