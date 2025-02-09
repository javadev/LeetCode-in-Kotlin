package g3401_3500.s3428_maximum_and_minimum_sums_of_at_most_size_k_subsequences

// #Medium #Array #Dynamic_Programming #Math #Sorting #Combinatorics
// #2025_01_22_Time_167_ms_(77.78%)_Space_75.34_MB_(66.67%)

class Solution {
    private lateinit var fact: LongArray
    private lateinit var inv: LongArray

    private fun precomputeFactorials(n: Int) {
        fact = LongArray(n + 1)
        inv = LongArray(n + 1)
        fact[0] = 1
        for (i in 1..n) {
            fact[i] = (fact[i - 1] * i) % MOD
        }
        inv[n] = power(fact[n], (MOD - 2).toLong(), MOD)
        for (i in n - 1 downTo 0) {
            inv[i] = (inv[i + 1] * (i + 1)) % MOD
        }
    }

    private fun power(a: Long, b: Long, m: Int): Long {
        var a = a
        var b = b
        var `val`: Long = 1
        a = a % m
        while (b > 0) {
            if ((b and 1L) == 1L) `val` = (`val` * a) % m
            b = b shr 1
            a = (a * a) % m
        }
        return `val`
    }

    private fun nCr(n: Int, r: Int): Long {
        if (r < 0 || r > n) return 0
        return (fact[n] * inv[r] % MOD * inv[n - r]) % MOD
    }

    fun minMaxSums(nums: IntArray, k: Int): Int {
        val n = nums.size
        nums.sort()
        precomputeFactorials(n)
        var sum: Long = 0
        for (i in 0..<n) {
            var `val`: Long = 0
            val a = i
            val b = n - 1 - i
            run {
                var j = 0
                while (j < k && j <= a) {
                    `val` = (`val` + nCr(a, j)) % MOD
                    j++
                }
            }
            sum = (sum + (`val` * nums[i]) % MOD) % MOD
            `val` = 0
            var j = 0
            while (j < k && j <= b) {
                `val` = (`val` + nCr(b, j)) % MOD
                j++
            }
            sum = (sum + (`val` * nums[i]) % MOD) % MOD
        }
        return sum.toInt()
    }

    companion object {
        private const val MOD = 1e9.toInt() + 7
    }
}
