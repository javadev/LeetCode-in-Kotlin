package g1001_1100.s1094_car_pooling

// #Medium #Array #Sorting #Heap_Priority_Queue #Simulation #Prefix_Sum
// #2023_06_03_Time_172_ms_(81.82%)_Space_37.6_MB_(72.73%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun carPooling(trips: Array<IntArray>, capacity: Int): Boolean {
        var capacity = capacity
        val stops = IntArray(1001)
        for (t in trips) {
            stops[t[1]] += t[0]
            stops[t[2]] -= t[0]
        }
        var i = 0
        while (capacity >= 0 && i < 1001) {
            capacity -= stops[i]
            ++i
        }
        return capacity >= 0
    }
}
