package g1501_1600.s1599_maximum_profit_of_operating_a_centennial_wheel

// #Medium #Array #Simulation #2023_06_14_Time_593_ms_(100.00%)_Space_56.3_MB_(100.00%)

class Solution {
    fun minOperationsMaxProfit(customers: IntArray, boardingCost: Int, runningCost: Int): Int {
        if (runningCost >= 4 * boardingCost) return -1
        var maxProfit = 0
        var currentProfit = 0
        var queue = 0
        var rotation = 0
        for (i in customers.indices) {
            queue += customers[i]
            val current = Math.min(queue, 4)
            queue -= current
            currentProfit += current * boardingCost - runningCost
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit
                rotation = i + 1
            }
        }
        val mod = queue / 4
        if (mod > 0) {
            currentProfit += mod * (4 * boardingCost - runningCost)
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit
                rotation = customers.size + mod
            }
        }
        val div = queue % 4
        if (div > 0) {
            currentProfit += div * boardingCost - runningCost
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit
                rotation = customers.size + mod + 1
            }
        }
        return if (maxProfit > 0) rotation else -1
    }
}