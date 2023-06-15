package g1701_1800.s1735_count_ways_to_make_array_with_product

// #Hard #Array #Dynamic_Programming #Math
class Solution {
    private lateinit var tri: Array<LongArray>
    private var primes: List<Int>? = null

    fun waysToFillArray(queries: Array<IntArray>): IntArray {
        val len: Int = queries.size
        val res = IntArray(len)
        primes = getPrimes(100)
        tri = getTri(10015, 15)
        for (i in 0 until len) {
            res[i] = calculate(queries.get(i).get(0), queries.get(i).get(1))
        }
        return res
    }

    private fun getPrimes(limit: Int): List<Int> {
        val notPrime: BooleanArray = BooleanArray(limit + 1)
        val res: MutableList<Int> = ArrayList()
        for (i in 2..limit) {
            if (!notPrime.get(i)) {
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
        val res: Array<LongArray> = Array(m + 1, { LongArray(n + 1) })
        for (i in 0..m) {
            res.get(i)[0] = 1
            for (j in 1..Math.min(n, i)) {
                res.get(i)[j] = (res.get(i - 1).get(j - 1) + res.get(i - 1).get(j)) % MOD
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
            var cnt: Int = 0
            while (target % prime == 0) {
                cnt++
                target /= prime
            }
            res = (res * tri.get(cnt + n - 1).get(cnt)) % MOD
        }
        return if (target > 1) (res * n % MOD).toInt() else res.toInt()
    }

    companion object {
        private val MOD: Int = 1000000007
    }
}
