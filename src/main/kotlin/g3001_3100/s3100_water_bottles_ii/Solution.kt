package g3001_3100.s3100_water_bottles_ii

// #Medium #Math #Simulation #2024_04_20_Time_137_ms_(70.49%)_Space_33.8_MB_(50.82%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun maxBottlesDrunk(numBottles: Int, numExchange: Int): Int {
        var numExchange = numExchange
        var emptyBottles = numBottles
        var bottleDrinks = numBottles
        while (numExchange <= emptyBottles) {
            bottleDrinks += 1
            emptyBottles = 1 + (emptyBottles - numExchange)
            numExchange++
        }
        return bottleDrinks
    }
}
