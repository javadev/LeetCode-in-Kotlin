package g1001_1100.s1033_moving_stones_until_consecutive

// #Medium #Math #Brainteaser #2023_05_25_Time_139_ms_(100.00%)_Space_35.3_MB_(100.00%)

class Solution {
    private fun minMoves(x: Int, y: Int, z: Int): Int {
        if (x + 1 == y && y + 1 == z) {
            return 0
        }
        return if (y - x <= 2 || z - y <= 2) {
            1
        } else 2
    }

    private fun maxMoves(x: Int, z: Int): Int {
        return z - x - 2
    }

    fun numMovesStones(a: Int, b: Int, c: Int): IntArray {
        val t = intArrayOf(a, b, c)
        t.sort()
        val min = minMoves(t[0], t[1], t[2])
        val max = maxMoves(t[0], t[2])
        return intArrayOf(min, max)
    }
}
