package g1101_1200.s1109_corporate_flight_bookings

// #Medium #Array #Prefix_Sum

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
