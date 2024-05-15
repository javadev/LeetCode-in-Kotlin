package g3101_3200.s3147_taking_maximum_energy_from_the_mystic_dungeon

// #Medium #Array #Prefix_Sum #2024_05_15_Time_671_ms_(79.17%)_Space_60.9_MB_(97.92%)

import kotlin.math.max

class Solution {
    fun maximumEnergy(energy: IntArray, k: Int): Int {
        var max = Int.MIN_VALUE
        val n = energy.size
        for (i in n - 1 downTo n - k) {
            var en = 0
            var j = i
            while (j >= 0) {
                en += energy[j]
                max = max(en, max)
                j -= k
            }
        }
        return max
    }
}
