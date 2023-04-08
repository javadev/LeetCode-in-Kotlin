package g0801_0900.s0871_minimum_number_of_refueling_stops

// #Hard #Array #Dynamic_Programming #Greedy #Heap_Priority_Queue
// #2023_04_08_Time_203_ms_(92.86%)_Space_37.1_MB_(92.86%)

import java.util.PriorityQueue

class Solution {
    fun minRefuelStops(target: Int, startFuel: Int, stations: Array<IntArray>?): Int {
        if (startFuel >= target) {
            return 0
        } else if (stations.isNullOrEmpty()) {
            return -1
        }
        val pq = PriorityQueue { a: IntArray, b: IntArray ->
            b[1] - a[1]
        }
        var start = 0
        val end = stations.size
        var currentFuel = startFuel
        var stops = 0
        while (currentFuel < target) {
            while (start < end && currentFuel >= stations[start][0]) {
                pq.add(stations[start++])
            }
            if (pq.isEmpty()) {
                return -1
            }
            val current = pq.poll()
            currentFuel += current[1]
            stops++
        }
        return stops
    }
}
