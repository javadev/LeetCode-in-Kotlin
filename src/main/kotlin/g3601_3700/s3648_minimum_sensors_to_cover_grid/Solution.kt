package g3601_3700.s3648_minimum_sensors_to_cover_grid

// #Medium #Biweekly_Contest_163 #2025_08_17_Time_0_ms_(100.00%)_Space_41.03_MB_(100.00%)

class Solution {
    fun minSensors(n: Int, m: Int, k: Int): Int {
        val size = k * 2 + 1
        val x = n / size + (if (n % size == 0) 0 else 1)
        val y = m / size + (if (m % size == 0) 0 else 1)
        return x * y
    }
}
