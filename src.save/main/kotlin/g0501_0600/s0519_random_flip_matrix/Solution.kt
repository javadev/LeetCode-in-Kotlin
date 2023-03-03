package g0501_0600.s0519_random_flip_matrix

// #Medium #Hash_Table #Math #Randomized #Reservoir_Sampling
// #2023_01_13_Time_270_ms_(100.00%)_Space_37.6_MB_(100.00%)

import java.util.Random

@Suppress("kotlin:S2245")
class Solution(nRows: Int, private val cols: Int) {
    private val total: Int
    private val rand: Random = Random()
    private val available: MutableSet<Int>

    init {
        available = HashSet()
        total = nRows * cols
    }

    fun flip(): IntArray {
        var x: Int = rand.nextInt(total)
        while (available.contains(x)) {
            x = rand.nextInt(total)
        }
        available.add(x)
        return intArrayOf(x / cols, x % cols)
    }

    fun reset() {
        available.clear()
    }
}

/*
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(m, n)
 * var param_1 = obj.flip()
 * obj.reset()
 */
