package g1801_1900.s1860_incremental_memory_leak

// #Medium #Simulation
@Suppress("NAME_SHADOWING")
class Solution {
    fun memLeak(memory1: Int, memory2: Int): IntArray {
        var memory1 = memory1
        var memory2 = memory2
        var time = 1
        while (memory1 >= time || memory2 >= time) {
            if (memory1 >= memory2) {
                memory1 -= time
            } else {
                memory2 -= time
            }
            time++
        }
        return intArrayOf(time, memory1, memory2)
    }
}
