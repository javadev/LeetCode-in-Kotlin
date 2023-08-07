package g2701_2800.s2739_total_distance_traveled

// #Easy #Math #Simulation #2023_08_05_Time_177_ms_(100.00%)_Space_35.9_MB_(92.11%)

import kotlin.math.min

class Solution {
    fun distanceTraveled(mainTank: Int, additionalTank: Int): Int {
        val transferableTimes = (mainTank - 1) / 4
        val transferredLiters = min(transferableTimes, additionalTank)
        return (mainTank + transferredLiters) * 10
    }
}
