package g2001_2100.s2079_watering_plants

// #Medium #Array #2023_06_27_Time_157_ms_(100.00%)_Space_36.5_MB_(50.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun wateringPlants(plants: IntArray, capacity: Int): Int {
        var capacity = capacity
        val initial = capacity
        var ans = 0
        for (i in plants.indices) {
            if (plants[i] <= capacity) {
                ++ans
                capacity -= plants[i]
            } else {
                ans += i
                capacity = initial
                ans += i + 1
                capacity -= plants[i]
            }
        }
        return ans
    }
}
