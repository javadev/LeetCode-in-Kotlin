package g2401_2500.s2498_frog_jump_ii

// #Medium #Array #Greedy #Binary_Search
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
