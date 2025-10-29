package g3701_3800.s3725_count_ways_to_choose_coprime_integers_from_rows

// #Hard #Array #Dynamic_Programming #Math #Matrix #Number_Theory #Combinatorics
// #Biweekly_Contest_168 #2025_10_28_Time_29_ms_(100.00%)_Space_51.80_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun countCoprime(mat: Array<IntArray>): Int {
        val m = mat.size
        val n = mat[0].size
        var maxVal = 0
        for (ints in mat) {
            for (j in 0..<n) {
                maxVal = max(maxVal, ints[j])
            }
        }
        val gcdWays: MutableMap<Int, Long> = HashMap()
        for (g in maxVal downTo 1) {
            var ways = countWaysWithDivisor(mat, g, m, n)
            if (ways > 0) {
                var multiple = 2 * g
                while (multiple <= maxVal) {
                    if (gcdWays.containsKey(multiple)) {
                        ways = (ways - gcdWays[multiple]!! + MOD) % MOD
                    }
                    multiple += g
                }
                gcdWays[g] = ways
            }
        }
        return gcdWays.getOrDefault(1, 0L).toInt()
    }

    private fun countWaysWithDivisor(matrix: Array<IntArray>, divisor: Int, rows: Int, cols: Int): Long {
        var totalWays: Long = 1
        for (row in 0..<rows) {
            var validChoices = 0
            for (col in 0..<cols) {
                if (matrix[row][col] % divisor == 0) {
                    validChoices++
                }
            }
            if (validChoices == 0) {
                return 0
            }
            totalWays = (totalWays * validChoices) % MOD
        }
        return totalWays
    }

    companion object {
        private const val MOD = 1000000007
    }
}
