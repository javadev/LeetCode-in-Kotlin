package g2901_3000.s2974_minimum_number_game

// #Easy #Array #Sorting #Heap_Priority_Queue #Simulation
// #2024_01_19_Time_213_ms_(97.92%)_Space_38.6_MB_(98.96%)

class Solution {
    fun numberGame(nums: IntArray): IntArray {
        nums.sort()
        val n = IntArray(nums.size)
        var i = 0
        var j = 1
        while (i < nums.size) {
            n[i] = nums[j]
            n[j] = nums[i]
            i += 2
            j += 2
        }
        return n
    }
}
