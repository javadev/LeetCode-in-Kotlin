package g1101_1200.s1109_corporate_flight_bookings

// #Medium #Array #Prefix_Sum #2023_05_31_Time_719_ms_(100.00%)_Space_124.5_MB_(100.00%)

class Solution {
    fun corpFlightBookings(bookings: Array<IntArray>, n: Int): IntArray {
        val ret = IntArray(n)
        for (booking in bookings) {
            ret[booking[0] - 1] += booking[2]
            if (booking[1] < n) {
                ret[booking[1]] -= booking[2]
            }
        }
        for (i in 1 until n) {
            ret[i] += ret[i - 1]
        }
        return ret
    }
}
