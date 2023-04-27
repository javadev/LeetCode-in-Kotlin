package g0901_1000.s0935_knight_dialer

// #Medium #Dynamic_Programming #2023_04_27_Time_160_ms_(100.00%)_Space_34.7_MB_(100.00%)

class Solution {
    fun knightDialer(n: Int): Int {
        if (n == 1) {
            return 10
        }
        val mod = 1000000007
        while (MEMO.size < n) {
            val cur = MEMO[MEMO.size - 1]
            val next = IntArray(10)
            for (i in 0..9) {
                for (d in MAP[i]!!) {
                    next[d] = (next[d] + cur[i]) % mod
                }
            }
            MEMO.add(next)
        }
        var sum = 0
        for (x in MEMO[n - 1]) {
            sum = (sum + x) % mod
        }
        return sum
    }

    companion object {
        private val MAP = arrayOfNulls<IntArray>(10)
        private val MEMO: MutableList<IntArray> = ArrayList()

        init {
            MAP[0] = intArrayOf(4, 6)
            MAP[1] = intArrayOf(6, 8)
            MAP[2] = intArrayOf(7, 9)
            MAP[3] = intArrayOf(4, 8)
            MAP[4] = intArrayOf(3, 9, 0)
            MAP[5] = IntArray(0)
            MAP[6] = intArrayOf(1, 7, 0)
            MAP[7] = intArrayOf(2, 6)
            MAP[8] = intArrayOf(1, 3)
            MAP[9] = intArrayOf(2, 4)
            MEMO.add(intArrayOf(1, 1, 1, 1, 1, 0, 1, 1, 1, 1))
        }
    }
}
