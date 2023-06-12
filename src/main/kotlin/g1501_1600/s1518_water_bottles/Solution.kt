package g1501_1600.s1518_water_bottles

// #Easy #Math #Simulation #2023_06_12_Time_116_ms_(100.00%)_Space_32.7_MB_(83.33%)

class Solution {
    fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
        var drunk = numBottles
        var emptyBottles = numBottles
        while (emptyBottles >= numExchange) {
            val exchangedBottles = emptyBottles / numExchange
            drunk += exchangedBottles
            val unUsedEmptyBottles = emptyBottles % numExchange
            emptyBottles = exchangedBottles + unUsedEmptyBottles
        }
        return drunk
    }
}
