package g4001_4100.s4039_sum_of_decoded_numbers

// #Medium #Array #Math #Simulation #Staff #Weekly_Contest_517
// #2026_11_25_Time_50_ms_(98.90%)_Space_78.76_MB_(98.35%)

class Solution {
    private val pow10 = LongArray(N)

    fun sumDecoded(nums: LongArray): Int {
        if (pow10[0] == 0L) {
            pow10[0] = 1
            for (i in 1..<N) {
                pow10[i] = pow10[i - 1] * 10
            }
        }
        var sum: Long = 0
        for (num in nums) {
            val w = (num % 10).toInt()
            val v = num / 10
            var len = 1
            while (v >= pow10[len]) {
                len++
            }
            val base = pow10[len - w]
            val x = v / base
            val y = v % base
            sum += pow(x, y)
        }
        return (sum % MOD).toInt()
    }

    private fun pow(x: Long, n: Long): Long {
        var x = x
        var n = n
        var result: Long = 1
        while (n > 0) {
            if ((n and 1L) == 1L) {
                result = result * x % MOD
            }
            x = x * x % MOD
            n = n shr 1
        }
        return result
    }

    companion object {
        private val MOD = 1e9.toInt() + 7
        private const val N = 16
    }
}
