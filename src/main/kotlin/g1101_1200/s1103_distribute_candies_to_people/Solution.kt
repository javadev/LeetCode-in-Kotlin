package g1101_1200.s1103_distribute_candies_to_people

// #Easy #Math #Simulation #2023_05_31_Time_129_ms_(100.00%)_Space_34.9_MB_(50.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun distributeCandies(candies: Int, numPeople: Int): IntArray {
        var candies = candies
        val candiesDistribution = IntArray(numPeople)
        var count = 1
        while (candies > 0) {
            for (i in 0 until numPeople) {
                if (candies >= count) {
                    candiesDistribution[i] += count
                    candies -= count
                    count++
                } else if (candies > 0) {
                    candiesDistribution[i] += candies
                    candies -= candies
                }
                if (candies == 0) {
                    return candiesDistribution
                }
            }
        }
        return candiesDistribution
    }
}
