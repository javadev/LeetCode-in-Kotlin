package g3501_3600.s3539_find_sum_of_array_product_of_magical_sequences

// #Hard #Array #Dynamic_Programming #Math #Bit_Manipulation #Bitmask #Combinatorics
// #2025_05_06_Time_60_ms_(100.00%)_Space_48.98_MB_(100.00%)

class Solution {
    fun magicalSum(m: Int, k: Int, nums: IntArray): Int {
        val n = nums.size
        val pow = Array<LongArray>(n) { LongArray(m + 1) }
        for (j in 0..<n) {
            pow[j][0] = 1L
            for (c in 1..m) {
                pow[j][c] = pow[j][c - 1] * nums[j] % MOD
            }
        }
        var dp = Array<Array<LongArray>>(m + 1) { Array<LongArray>(k + 1) { LongArray(m + 1) } }
        var next = Array<Array<LongArray>>(m + 1) { Array<LongArray>(k + 1) { LongArray(m + 1) } }
        dp[0][0][0] = 1L
        for (i in 0..<n) {
            for (t in 0..m) {
                for (o in 0..k) {
                    next[t][o].fill(0L)
                }
            }
            for (t in 0..m) {
                for (o in 0..k) {
                    for (c in 0..m) {
                        if (dp[t][o][c] == 0L) {
                            continue
                        }
                        for (cc in 0..m - t) {
                            val total = c + cc
                            if (o + (total and 1) > k) {
                                continue
                            }
                            next[t + cc][o + (total and 1)][total ushr 1] =
                                (
                                    (
                                        next[t + cc][o + (total and 1)][total ushr 1] +
                                            dp[t][o][c] *
                                            C[m - t][cc] %
                                            MOD
                                            * pow[i][cc] %
                                            MOD
                                        ) %
                                        MOD
                                    )
                        }
                    }
                }
            }
            val tmp = dp
            dp = next
            next = tmp
        }
        var res: Long = 0
        for (o in 0..k) {
            for (c in 0..m) {
                if (o + P[c] == k) {
                    res = (res + dp[m][o][c]) % MOD
                }
            }
        }
        return res.toInt()
    }

    companion object {
        private const val MOD = 1000000007
        private val C: Array<IntArray> = precomputeBinom(31)
        private val P: IntArray = precomputePop(31)

        private fun precomputeBinom(max: Int): Array<IntArray> {
            val res = Array<IntArray>(max) { IntArray(max) }
            for (i in 0..<max) {
                res[i][i] = 1
                res[i][0] = res[i][i]
                for (j in 1..<i) {
                    res[i][j] = (res[i - 1][j - 1] + res[i - 1][j]) % MOD
                }
            }
            return res
        }

        private fun precomputePop(max: Int): IntArray {
            val res = IntArray(max)
            for (i in 1..<max) {
                res[i] = res[i shr 1] + (i and 1)
            }
            return res
        }
    }
}
