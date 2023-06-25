package g2101_2200.s2187_minimum_time_to_complete_trips

// #Medium #Array #Binary_Search
class Solution {
    fun minimumTime(time: IntArray, totalTrips: Int): Long {
        return bs(0, Long.MAX_VALUE, time, totalTrips.toLong())
    }

    private fun bs(left: Long, right: Long, time: IntArray, totalTrips: Long): Long {
        if (left > right) {
            return Long.MAX_VALUE
        }
        val mid = left + right shr 1
        return if (isPossible(time, mid, totalTrips)) Math.min(
            mid,
            bs(left, mid - 1, time, totalTrips)
        ) else bs(mid + 1, right, time, totalTrips)
    }

    private fun isPossible(time: IntArray, mid: Long, totalTrips: Long): Boolean {
        var count: Long = 0
        for (i in time) {
            count += mid / i
            if (count >= totalTrips) {
                return true
            }
        }
        return false
    }
}
