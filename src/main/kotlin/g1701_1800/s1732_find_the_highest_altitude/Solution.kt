package g1701_1800.s1732_find_the_highest_altitude

// #Easy #Array #Prefix_Sum #2023_06_16_Time_139_ms_(90.70%)_Space_34.1_MB_(63.95%)

class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var max = 0
        val altitudes = IntArray(gain.size + 1)
        for (i in gain.indices) {
            altitudes[i + 1] = altitudes[i] + gain[i]
            max = Math.max(max, altitudes[i + 1])
        }
        return max
    }
}
