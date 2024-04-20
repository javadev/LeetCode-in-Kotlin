package g3001_3100.s3096_minimum_levels_to_gain_more_points

// #Medium #Array #Prefix_Sum #2024_04_20_Time_850_ms_(100.00%)_Space_67.9_MB_(97.22%)

class Solution {
    fun minimumLevels(possible: IntArray): Int {
        val n = possible.size
        var sum = 0
        for (p in possible) {
            sum += p
        }
        if (sum == 0 && n == 2) {
            return -1
        }
        if (sum == 0 && n > 2) {
            return 1
        }
        var sumLeft = 0
        for (i in 0 until n - 1) {
            sumLeft += possible[i]
            val sumRight = sum - sumLeft
            val danScore = sumLeft - ((i + 1) - sumLeft)
            val bobScore = sumRight - ((n - i - 1) - sumRight)
            if (danScore > bobScore) {
                return i + 1
            }
        }
        return -1
    }
}
