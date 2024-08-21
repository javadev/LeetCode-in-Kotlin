package g3201_3300.s3259_maximum_energy_boost_from_two_drinks

// #Medium #Array #Dynamic_Programming #2024_08_21_Time_811_ms_(96.88%)_Space_64.1_MB_(90.63%)

import kotlin.math.max

class Solution {
    fun maxEnergyBoost(energyDrinkA: IntArray, energyDrinkB: IntArray): Long {
        var a0: Long = 0
        var a1: Long = 0
        var b0: Long = 0
        var b1: Long = 0
        val n = energyDrinkA.size
        for (i in 0 until n) {
            a1 = max((a0 + energyDrinkA[i]), b0)
            b1 = max((b0 + energyDrinkB[i]), a0)
            a0 = a1
            b0 = b1
        }
        return max(a1, b1)
    }
}
