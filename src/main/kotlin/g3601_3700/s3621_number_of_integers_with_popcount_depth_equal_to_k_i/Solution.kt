package g3601_3700.s3621_number_of_integers_with_popcount_depth_equal_to_k_i

// #Hard #Biweekly_Contest_161 #2025_07_22_Time_2_ms_(100.00%)_Space_41.19_MB_(100.00%)

class Solution {
    companion object {
        private val comb = Array(61) { LongArray(61) }
        private val depth = IntArray(61)

        init {
            for (i in 0..60) {
                comb[i][0] = 1L
                comb[i][i] = 1L
                for (j in 1 until i) {
                    comb[i][j] = comb[i - 1][j - 1] + comb[i - 1][j]
                }
            }
            depth[1] = 0
            for (i in 2..60) {
                depth[i] = depth[i.countOneBits()] + 1
            }
        }
    }

    fun popcountDepth(n: Long, k: Int): Long {
        if (k == 0) { return 1L }
        fun countPop(x: Long, c: Int): Long {
            var res = 0L
            var ones = 0
            var bits = 0
            var t = x
            while (t > 0) {
                bits++
                t = t shr 1
            }
            for (i in bits - 1 downTo 0) {
                if ((x shr i) and 1L == 1L) {
                    val rem = c - ones
                    if (rem in 0..i) {
                        res += comb[i][rem]
                    }
                    ones++
                }
            }
            return if (ones == c) res + 1 else res
        }
        var ans = 0L
        for (c in 1..60) {
            if (depth[c] == k - 1) {
                ans += countPop(n, c)
            }
        }
        if (k == 1) { ans-- }
        return ans
    }
}
