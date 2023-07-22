package g2301_2400.s2332_the_latest_time_to_catch_a_bus

// #Medium #Array #Sorting #Binary_Search #Two_Pointers
// #2023_07_01_Time_522_ms_(75.00%)_Space_61.7_MB_(62.50%)

class Solution {
    fun latestTimeCatchTheBus(buses: IntArray, passengers: IntArray, capacity: Int): Int {
        // sort arrays and move in arrays from left to right and find capacity in last bus
        // if capcity is full in last bus then find time last passenger might have boarded then go
        // backward till find a slot to replace last passenger
        // if capacity is not full in last bus then start with last bus departure time and check if
        // can board on last moment and go backward till find a available time slot
        buses.sort()
        passengers.sort()
        val blen = buses.size
        val plen = passengers.size
        var b = 0
        var p = 0
        var c = 0
        // find capacity in last bus
        while (b < blen && p < plen) {
            if (passengers[p] <= buses[b] && c < capacity) {
                c++
                p++
            }
            if (c == capacity || p < plen && passengers[p] > buses[b]) {
                if (b < blen - 1) {
                    c = 0
                }
                b++
            }
        }
        var start: Int = if (c == capacity) {
            // capcity is full in last bus, find time last passenger might have boarded
            passengers[p - 1].coerceAtMost(buses[blen - 1])
        } else {
            // capacity is not full in last bus, start with last bus departure time and check if can
            // board on last moment
            buses[blen - 1]
        }
        // go backward till find a slot
        while (p > 0 && start == passengers[p - 1]) {
            start--
            p--
        }
        return start
    }
}
