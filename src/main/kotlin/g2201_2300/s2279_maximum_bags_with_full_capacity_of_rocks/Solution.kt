package g2201_2300.s2279_maximum_bags_with_full_capacity_of_rocks

// #Medium #Array #Sorting #Greedy
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
