package g2201_2300.s2279_maximum_bags_with_full_capacity_of_rocks

// #Medium #Array #Sorting #Greedy #2023_06_28_Time_551_ms_(80.00%)_Space_56.5_MB_(90.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun maximumBags(capacity: IntArray, rocks: IntArray, additionalRocks: Int): Int {
        var additionalRocks = additionalRocks
        val len = capacity.size
        for (i in 0 until len) {
            capacity[i] -= rocks[i]
        }
        capacity.sort()
        var total = 0
        var i = 0
        while (i < len && additionalRocks > 0) {
            if (capacity[i] <= additionalRocks) {
                additionalRocks -= capacity[i]
                total++
            }
            i++
        }
        return total
    }
}
