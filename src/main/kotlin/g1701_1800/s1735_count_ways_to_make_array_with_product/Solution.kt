package g1701_1800.s1735_count_ways_to_make_array_with_product

// #Hard #Array #Dynamic_Programming #Math #2023_06_16_Time_394_ms_(100.00%)_Space_50.6_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    private lateinit var tri: Array<LongArray>
    private var primes: List<Int>? = null

    fun waysToFillArray(queries: Array<IntArray>): IntArray {
        val len: Int = queries.size
        val res = IntArray(len)
        primes = getPrimes(100)
        tri = getTri(10015, 15)
        for (i in 0 until len) {
            res[i] = calculate(queries[i][0], queries[i][1])
        }
        return res
    }

    private fun getPrimes(limit: Int): List<Int> {
        val notPrime = BooleanArray(limit + 1)
        val res: MutableList<Int> = ArrayList()
        for (i in 2..limit) {
            if (!notPrime[i]) {
                res.add(i)
                var j: Int = i * i
                while (j <= limit) {
                    notPrime[j] = true
                    j += i
                }
            }
        }
        return res
    }

    private fun getTri(m: Int, n: Int): Array<LongArray> {
        val res: Array<LongArray> = Array(m + 1) { LongArray(n + 1) }
        for (i in 0..m) {
            res[i][0] = 1
            for (j in 1..Math.min(n, i)) {
                res[i][j] = (res[i - 1][j - 1] + res[i - 1][j]) % MOD
            }
        }
        return res
    }

    private fun calculate(n: Int, target: Int): Int {
        var target: Int = target
        var res: Long = 1
        for (prime: Int in primes!!) {
            if (prime > target) {
                break
            }
            var cnt = 0
            while (target % prime == 0) {
                cnt++
                target /= prime
            }
            res = (res * tri[cnt + n - 1][cnt]) % MOD
        }
        return if (target > 1) (res * n % MOD).toInt() else res.toInt()
    }

    companion object {
        private val MOD: Int = 1000000007
    }
}
