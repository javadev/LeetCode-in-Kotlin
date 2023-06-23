package g2101_2200.s2105_watering_plants_ii

// #Medium #Array #Two_Pointers #Simulation
@Suppress("NAME_SHADOWING")
class Solution {
    fun minimumRefill(plants: IntArray, capacityA: Int, capacityB: Int): Int {
        var capacityA = capacityA
        var capacityB = capacityB
        val n = plants.size
        var i = 0
        var j = n - 1
        var aRefill = 0
        var bRefill = 0
        val initialCapacityA = capacityA
        val initialCapacityB = capacityB
        while (i <= j) {
            if (i == j) {
                if (!(capacityA >= plants[i] || capacityB >= plants[i])) {
                    aRefill++
                }
                i++
                continue
            }
            capacityA = if (capacityA >= plants[i]) {
                capacityA - plants[i]
            } else {
                aRefill++
                initialCapacityA - plants[i]
            }
            capacityB = if (capacityB >= plants[j]) {
                capacityB - plants[j]
            } else {
                bRefill++
                initialCapacityB - plants[j]
            }
            i++
            j--
        }
        return aRefill + bRefill
    }
}
