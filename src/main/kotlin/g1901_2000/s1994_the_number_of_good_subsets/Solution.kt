package g1901_2000.s1994_the_number_of_good_subsets

// #Hard #Array #Dynamic_Programming #Math #Bit_Manipulation #Bitmask
// #2023_06_21_Time_737_ms_(100.00%)_Space_54.2_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    private fun add(a: Long, b: Long): Long {
        var a = a
        a += b
        return if (a < MOD) a else a - MOD
    }

    private fun mul(a: Long, b: Long): Long {
        var a = a
        a *= b
        return if (a < MOD) a else a % MOD
    }

    private fun pow(a: Long, b: Long): Long {
        // a %= MOD;
        // b%=(MOD-1);//if MOD is prime
        var a = a
        var b = b
        var res: Long = 1
        while (b > 0) {
            if (b and 1L == 1L) {
                res = mul(res, a)
            }
            a = mul(a, a)
            b = b shr 1
        }
        return add(res, 0)
    }

    fun numberOfGoodSubsets(nums: IntArray): Int {
        val primes = intArrayOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
        val mask = IntArray(31)
        val freq = IntArray(31)
        for (x in nums) {
            freq[x]++
        }
        for (i in 1..30) {
            for (j in primes.indices) {
                if (i % primes[j] == 0) {
                    if (i / primes[j] % primes[j] == 0) {
                        mask[i] = 0
                        break
                    }
                    mask[i] = mask[i] or pow(2, j.toLong()).toInt()
                }
            }
        }
        val dp = LongArray(1024)
        dp[0] = 1
        for (i in 1..30) {
            if (mask[i] != 0) {
                for (j in 0..1023) {
                    if (mask[i] and j == 0 && dp[j] > 0) {
                        dp[mask[i] or j] = add(dp[mask[i] or j], mul(dp[j], freq[i].toLong()))
                    }
                }
            }
        }
        var ans: Long = 0
        for (i in 1..1023) {
            ans = add(ans, dp[i])
        }
        ans = mul(ans, pow(2, freq[1].toLong()))
        ans = add(ans, 0)
        return ans.toInt()
    }

    companion object {
        private const val MOD = (1e9 + 7).toLong()
    }
}
