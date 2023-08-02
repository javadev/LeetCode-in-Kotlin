package g2601_2700.s2651_calculate_delayed_arrival_time

// #Easy #Math #2023_07_20_Time_129_ms_(88.00%)_Space_33.3_MB_(48.00%)

class Solution {
    fun findDelayedArrivalTime(ar: Int, de: Int): Int {
        if (ar + de >= 24) {
            return kotlin.math.abs(ar + de - 24)
        }
        return ar + de
    }
}
