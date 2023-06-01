package g0401_0500.s0478_generate_random_point_in_a_circle

// #Medium #Math #Geometry #Randomized #Rejection_Sampling
// #2023_01_01_Time_862_ms_(100.00%)_Space_70_MB_(66.67%)

import java.util.Random

@Suppress("kotlin:S2245")
class Solution(private val radius: Double, private val xCenter: Double, private val yCenter: Double) {
    private val random: Random = Random()
    fun randPoint(): DoubleArray {
        var x = getCoordinate(xCenter)
        var y = getCoordinate(yCenter)
        while (getDistance(x, y) >= radius * radius) {
            x = getCoordinate(xCenter)
            y = getCoordinate(yCenter)
        }
        return doubleArrayOf(x, y)
    }

    private fun getDistance(x: Double, y: Double): Double {
        return (xCenter - x) * (xCenter - x) + (yCenter - y) * (yCenter - y)
    }

    private fun getCoordinate(center: Double): Double {
        return center - radius + random.nextDouble() * 2 * radius
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(radius, x_center, y_center)
 * var param_1 = obj.randPoint()
 */
