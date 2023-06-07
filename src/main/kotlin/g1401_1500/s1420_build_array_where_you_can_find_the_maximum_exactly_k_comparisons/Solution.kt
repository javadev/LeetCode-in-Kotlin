package g1401_1500.s1420_build_array_where_you_can_find_the_maximum_exactly_k_comparisons

// #Hard #Dynamic_Programming
class Solution {
    fun numOfArrays(n: Int, m: Int, k: Int): Int {
        var ways = Array(m + 1) { LongArray(k + 1) }
        var sums = Array(m + 1) { LongArray(k + 1) }
        for (max in 1..m) {
            ways[max][1] = 1
            sums[max][1] = ways[max][1] + sums[max - 1][1]
        }
        for (count in 2..n) {
            val ways2 = Array(m + 1) { LongArray(k + 1) }
            val sums2 = Array(m + 1) { LongArray(k + 1) }
            for (max in 1..m) {
                for (cost in 1..k) {
                    val noCost = max * ways[max][cost] % MOD
                    val newCost = sums[max - 1][cost - 1]
                    ways2[max][cost] = (noCost + newCost) % MOD
                    sums2[max][cost] = (sums2[max - 1][cost] + ways2[max][cost]) % MOD
                }
            }
            ways = ways2
            sums = sums2
        }
        return sums[m][k].toInt()
    }

    companion object {
        private const val MOD = 1000000007
    }
}
