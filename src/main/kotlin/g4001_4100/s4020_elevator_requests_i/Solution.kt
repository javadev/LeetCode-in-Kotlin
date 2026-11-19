package g4001_4100.s4020_elevator_requests_i

// #Easy #Array #Simulation #Mid_Level #Biweekly_Contest_189
// #2026_11_19_Time_1_ms_(99.23%)_Space_44.25_MB_(70.81%)

import kotlin.math.abs

class Solution {
    fun elevatorRequests(n: Int, requests: IntArray): Int {
        var time = requests[0]
        for (i in 1..<requests.size) {
            val currDiff = abs(requests[i] - requests[i - 1])
            time += currDiff
        }
        return time
    }
}
