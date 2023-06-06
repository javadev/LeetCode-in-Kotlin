package g1301_1400.s1344_angle_between_hands_of_a_clock

// #Medium #Math #2023_06_06_Time_118_ms_(83.33%)_Space_33.1_MB_(100.00%)

class Solution {
    fun angleClock(hour: Int, minutes: Int): Double {
        val minAngle = minutes * 360.0 / 60
        val hourAnglePart1: Double = if (hour != 12) hour * 360.0 / 12 else 0.0
        val hourAnglePart2 = (30 * minutes).toDouble() / 60.0
        val hourAngle = hourAnglePart1 + hourAnglePart2
        val preResult = Math.abs(minAngle - hourAngle)
        return if (preResult > 180) 360 - preResult else preResult
    }
}
