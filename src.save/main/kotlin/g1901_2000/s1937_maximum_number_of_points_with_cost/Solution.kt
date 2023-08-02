package g1901_2000.s1937_maximum_number_of_points_with_cost

// #Medium #Array #Dynamic_Programming #2023_06_20_Time_886_ms_(100.00%)_Space_80.8_MB_(100.00%)

class Solution {
    fun maxPoints(points: Array<IntArray>): Long {
        val m = points[0].size
        var pre = LongArray(m)
        for (point in points) {
            val current = LongArray(m)
            var max = Long.MIN_VALUE
            for (j in 0 until m) {
                max = Math.max(max, pre[j] + j)
                current[j] = Math.max(current[j], point[j] - j + max)
            }
            max = Long.MIN_VALUE
            for (j in m - 1 downTo 0) {
                max = Math.max(max, pre[j] - j)
                current[j] = Math.max(current[j], point[j] + j + max)
            }
            pre = current
        }
        var max = Long.MIN_VALUE
        for (`val` in pre) {
            max = Math.max(max, `val`)
        }
        return max
    }
}
