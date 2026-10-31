package g3701_3800.s3756_concatenate_non_zero_digits_and_multiply_by_sum_ii

// #Medium #String #Math #Prefix_Sum #Staff #Weekly_Contest_477
// #2026_04_25_Time_14_ms_(100.00%)_Space_131.16_MB_(32.94%)

class Solution {
    fun sumAndMultiply(s: String, queries: Array<IntArray>): IntArray {
        val m = s.length
        val p = LongArray(m + 1)
        val sum = LongArray(m + 1)
        val cnt = IntArray(m + 1)
        val pow10 = LongArray(m + 1)
        pow10[0] = 1
        for (i in 0..<m) {
            val d = s.get(i).code - '0'.code
            if (d != 0) {
                p[i + 1] = (p[i] * 10 + d) % MOD
            } else {
                p[i + 1] = p[i]
            }
            sum[i + 1] = sum[i] + d
            cnt[i + 1] = cnt[i] + (if (d != 0) 1 else 0)
            pow10[i + 1] = pow10[i] * 10 % MOD
        }
        val ans = IntArray(queries.size)
        for (i in queries.indices) {
            val l = queries[i]!![0]
            val r = queries[i]!![1]
            val k = cnt[r + 1] - cnt[l]
            val x: Long = (p[r + 1] - p[l] * pow10[k] % MOD + MOD) % MOD
            val digitSum = sum[r + 1] - sum[l]
            ans[i] = (x * digitSum % MOD).toInt()
        }
        return ans
    }

    companion object {
        private const val MOD: Long = 1000000007
    }
}
