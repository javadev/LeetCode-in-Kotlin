package g1101_1200.s1184_distance_between_bus_stops

// #Easy #Array

class Solution {
    fun distanceBetweenBusStops(distance: IntArray, start: Int, destination: Int): Int {
        var start = start
        var destination = destination
        if (start > destination) {
            val tmp = start
            start = destination
            destination = tmp
        }
        var clockwise = 0
        for (i in start until destination) {
            clockwise += distance[i]
        }
        var counterClockwise = 0
        for (i in destination until distance.size) {
            counterClockwise += distance[i]
        }
        for (i in 0 until start) {
            counterClockwise += distance[i]
        }
        return Math.min(clockwise, counterClockwise)
    }
}
