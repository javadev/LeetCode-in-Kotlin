package g2401_2500.s2498_frog_jump_ii

// #Medium #Array #Greedy #Binary_Search #2023_07_04_Time_482_ms_(100.00%)_Space_60.1_MB_(100.00%)

class Solution {
    fun maxJump(stones: IntArray): Int {
        val n = stones.size
        var max = 0
        for (i in 2 until n) {
            val gap = stones[i] - stones[i - 2]
            if (gap > max) {
                max = gap
            }
        }
        return if (n > 2) {
            max
        } else {
            stones[1] - stones[0]
        }
    }
}
