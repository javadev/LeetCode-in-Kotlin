package g2001_2100.s2008_maximum_earnings_from_taxi

class Solution {
    fun maxTaxiEarnings(n: Int, rides: Array<IntArray>): Long {
        if (rides.size == 1) {
            return calculateEarnings(rides[0]).toLong()
        }
        val map: MutableMap<Int, MutableList<IntArray>> = HashMap()
        for (ride in rides) map.compute(ride[1]) { _, v -> v ?: ArrayList() }?.add(ride)
        val maximisedEarnings = LongArray(n + 1)
        maximisedEarnings.fill(0)
        for (i in 1 until maximisedEarnings.size) {
            maximisedEarnings[i] = maximisedEarnings[i - 1]
            val passengers: List<IntArray>? = map[i]
            if (passengers != null) {
                for (passenger in passengers) {
                    val earning = calculateEarnings(passenger)
                    maximisedEarnings[i] = Math.max(
                        maximisedEarnings[i],
                        maximisedEarnings[passenger[0]] + earning
                    )
                }
            }
        }
        return maximisedEarnings[n]
    }

    private fun calculateEarnings(currentRide: IntArray): Int {
        return currentRide[1] - currentRide[0] + currentRide[2]
    }
}
