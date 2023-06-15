package g1701_1800.s1701_average_waiting_time

// #Medium #Array #Simulation
class Solution {
    fun averageWaitingTime(customers: Array<IntArray>): Double {
        var ctime = 0
        var ans = 0.0
        for (customer in customers) {
            if (customer[0] >= ctime) {
                ctime = customer[0] + customer[1]
                ans = ans + (ctime - customer[0])
            } else {
                ctime = ctime + customer[1]
                ans = ans + (ctime - customer[0])
            }
        }
        return Math.round(ans / customers.size * 100000.0) / 100000.0
    }
}
