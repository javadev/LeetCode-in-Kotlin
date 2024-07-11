package g3201_3300.s3207_maximum_points_after_enemy_battles

// #Medium #Array #Greedy #2024_07_09_Time_1_ms_(100.00%)_Space_55.5_MB_(99.34%)

import kotlin.math.min

class Solution {
    fun maximumPoints(enemyEnergies: IntArray, currentEnergy: Int): Long {
        val n = enemyEnergies.size
        var min = enemyEnergies[0]
        for (i in 1 until n) {
            min = min(min.toDouble(), enemyEnergies[i].toDouble()).toInt()
        }
        if (currentEnergy == 0 || currentEnergy < min) {
            return 0
        }
        var sum = currentEnergy.toLong()
        for (i in n - 1 downTo 0) {
            sum += enemyEnergies[i].toLong()
        }
        sum -= min.toLong()
        return sum / min
    }
}
