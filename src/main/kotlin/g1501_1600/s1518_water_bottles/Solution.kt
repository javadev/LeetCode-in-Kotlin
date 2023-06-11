package g1501_1600.s1518_water_bottles

// #Easy #Math #Simulation
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
