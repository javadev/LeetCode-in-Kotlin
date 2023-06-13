package g1501_1600.s1599_maximum_profit_of_operating_a_centennial_wheel

// #Medium #Array #Simulation
class Solution {
    fun minOperationsMaxProfit(customers: IntArray, boardingCost: Int, runningCost: Int): Int {
        var maxProfit = 0
        var shift = -1
        var waiting = 0
        var profit = 0
        for (i in customers.indices) {
            // In each shift adding new passenger to the waiting line
            waiting += customers[i]
            profit += Math.min(waiting, 4) * boardingCost - runningCost
            if (profit > maxProfit) {
                shift = i + 1
                maxProfit = profit
            }
            waiting = Math.max(waiting - 4, 0)
        }
        // profitable to serve all the remaining waiting line?
        if (boardingCost * 4 > runningCost) {
            shift += waiting / 4
            // profitable for the last round?
            shift += if (waiting % 4 * boardingCost - runningCost > 0) 1 else 0
        }
        return shift
    }
}
