package g0401_0500.s0495_teemo_attacking

// #Easy #Array #Simulation #2023_01_04_Time_283_ms_(100.00%)_Space_39.3_MB_(86.96%)

class Solution {
    fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
        if (duration == 0) {
            return 0
        }
        var start = timeSeries[0]
        var end = timeSeries[0] + duration - 1
        var poisonDuration = end - start + 1
        for (i in 1 until timeSeries.size) {
            if (timeSeries[i] <= end) {
                poisonDuration += duration - (end - timeSeries[i] + 1)
                end += duration - (end - timeSeries[i] + 1)
            } else {
                start = timeSeries[i]
                end = timeSeries[i] + duration - 1
                poisonDuration += end - start + 1
            }
        }
        return poisonDuration
    }
}
