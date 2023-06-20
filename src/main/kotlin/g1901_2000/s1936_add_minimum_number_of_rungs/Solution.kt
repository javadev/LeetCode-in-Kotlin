package g1901_2000.s1936_add_minimum_number_of_rungs

// #Medium #Array #Greedy #2023_06_20_Time_405_ms_(100.00%)_Space_50.7_MB_(100.00%)

class Solution {
    fun addRungs(rungs: IntArray, dist: Int): Int {
        var addons = 0
        var currentHeight = 0
        var i = 0
        while (i < rungs.size) {
            val nextRung = rungs[i]
            if (nextRung - currentHeight <= dist) {
                currentHeight = nextRung
                i++
            } else {
                val adds = (nextRung - currentHeight - 1) / dist
                addons += adds
                currentHeight += dist * adds
            }
        }
        return addons
    }
}
