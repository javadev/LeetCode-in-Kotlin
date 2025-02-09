package g3401_3500.s3426_manhattan_distances_of_all_arrangements_of_pieces

// #Hard #Math #Combinatorics #2025_01_19_Time_21_ms_(100.00%)_Space_34.61_MB_(100.00%)

class Solution {
    private fun comb(a: Long, b: Long, mod: Long): Long {
        if (b > a) {
            return 0
        }
        var numer: Long = 1
        var denom: Long = 1
        for (i in 0..<b) {
            numer = numer * (a - i) % mod
            denom = denom * (i + 1) % mod
        }
        var denomInv: Long = 1
        var exp = mod - 2
        while (exp > 0) {
            if (exp % 2 > 0) {
                denomInv = denomInv * denom % mod
            }
            denom = denom * denom % mod
            exp /= 2
        }
        return numer * denomInv % mod
    }

    fun distanceSum(m: Int, n: Int, k: Int): Int {
        var res: Long = 0
        val mod: Long = 1000000007
        val base = comb(m.toLong() * n - 2, k - 2L, mod)
        for (d in 1..<n) {
            res = (res + d.toLong() * (n - d) % mod * m % mod * m % mod) % mod
        }
        for (d in 1..<m) {
            res = (res + d.toLong() * (m - d) % mod * n % mod * n % mod) % mod
        }
        return (res * base % mod).toInt()
    }
}
