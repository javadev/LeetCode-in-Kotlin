package g2501_2600.s2572_count_the_number_of_square_free_subsets

// #Medium #Array #Dynamic_Programming #Math #Bit_Manipulation #Bitmask
// #2023_07_09_Time_218_ms_(100.00%)_Space_37.8_MB_(100.00%)

class Solution {
    private val primes = intArrayOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
    private val badNums = (1..30).filter { primes.any { p -> it % (p * p) == 0 } }.toSet()
    private val nonPrimes = (2..30).filter { it !in primes }.filter { it !in badNums }.toList()

    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }

    fun squareFreeSubsets(nums: IntArray): Int {
        val mod: Long = 1_000_000_007
        // Get the frequency map
        val freqMap = nums.toTypedArray().groupingBy { it }.eachCount()
        var dp = mutableMapOf<Int, Long>()
        for (v in nonPrimes) {
            if (v !in freqMap) continue
            val howmany = freqMap[v]!!
            val prev = HashMap(dp)
            dp[v] = (dp[v] ?: 0) + howmany
            for ((product, quantity) in prev)
                if (gcd(product, v) == 1) {
                    dp[product * v] = ((dp[product * v] ?: 0L) + quantity * howmany.toLong()) % mod
                }
        }
        for (v in primes) {
            if (v !in freqMap) continue
            val howmany = freqMap[v]!!.toLong()
            val prev = dp
            dp = mutableMapOf<Int, Long>()
            dp[v] = howmany
            for ((product, quantity) in prev)
                dp[product] = if (product % v != 0) quantity * (1 + howmany) else quantity
        }
        // Getting all possible subsets without `1`
        var res = dp.values.sum() % mod
        // Find the permutations of `1`
        val possible = (1..(freqMap[1] ?: 0)).fold(1L) { sum, _ -> (sum shl 1) % mod }
        res = (res * possible + possible + mod - 1) % mod
        return res.toInt()
    }
}
