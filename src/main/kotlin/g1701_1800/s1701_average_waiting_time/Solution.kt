package g1701_1800.s1701_average_waiting_time

// #Medium #Array #Simulation #2023_06_15_Time_654_ms_(100.00%)_Space_105.7_MB_(100.00%)

class Solution {
    fun averageWaitingTime(customers: Array<IntArray>): Double {
        var ctime = 0
        var ans = 0.0
        for (customer in customers) {
            if (customer[0] >= ctime) {
                ctime = customer[0] + customer[1]
                ans += (ctime - customer[0])
            } else {
                ctime += customer[1]
                ans += (ctime - customer[0])
            }
        }
        return Math.round(ans / customers.size * 100000.0) / 100000.0
    }
}
