package g2701_2800.s2766_relocate_marbles

// #Medium #Array #Hash_Table #Sorting #Simulation
// #2023_08_11_Time_1038_ms_(100.00%)_Space_79.8_MB_(51.61%)

class Solution {
    fun relocateMarbles(nums: IntArray, moveFrom: IntArray, moveTo: IntArray): List<Int> {
        val s = HashSet<Int>()
        nums.forEach { s.add(it) }
        for (i in moveTo.indices) {
            if (s.contains(moveFrom[i])) {
                s.remove(moveFrom[i])
                s.add(moveTo[i])
            }
        }
        return s.toList().sorted()
    }
}
