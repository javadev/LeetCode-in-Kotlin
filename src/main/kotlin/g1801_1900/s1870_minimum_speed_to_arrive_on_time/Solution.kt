package g1801_1900.s1870_minimum_speed_to_arrive_on_time

// #Medium #Array #Binary_Search #Binary_Search_II_Day_6
class Solution {
    fun minSpeedOnTime(dist: IntArray, hour: Double): Int {
        val n = dist.size
        return fmin(dist, n, hour)
    }

    private fun check(dist: IntArray, n: Int, h: Double, spe: Int): Boolean {
        var cost = 0.0
        for (i in 0 until n - 1) {
            // same as ceil(doubleTime/doubleSpeed)
            cost += ((dist[i] - 1) / spe + 1).toDouble()
        }
        cost += dist[n - 1].toDouble() / spe.toDouble()
        return cost <= h
    }

    private fun fmin(dist: IntArray, n: Int, h: Double): Int {
        if (h + 1 <= n) {
            return -1
        }
        val max = fmax(dist) * 100
        var lo = 1
        var hi = max
        while (lo < hi) {
            val mid = (lo + hi) / 2
            // speed of mid is possible, move to left side
            if (check(dist, n, h, mid)) {
                hi = mid
            } else {
                // need higher speed, move to right side
                lo = mid + 1
            }
        }
        return lo
    }

    private fun fmax(arr: IntArray): Int {
        var res = arr[0]
        for (num in arr) {
            res = Math.max(res, num)
        }
        return res
    }
}
