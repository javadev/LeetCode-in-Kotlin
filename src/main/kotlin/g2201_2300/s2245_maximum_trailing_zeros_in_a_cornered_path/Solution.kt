package g2201_2300.s2245_maximum_trailing_zeros_in_a_cornered_path

// #Medium #Array #Matrix #Prefix_Sum
@Suppress("NAME_SHADOWING")
class Solution {
    fun maxTrailingZeros(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        var max = 0
        val row2 = Array(m + 1) { IntArray(n + 1) }
        val row5 = Array(m + 1) { IntArray(n + 1) }
        val col2 = Array(m + 1) { IntArray(n + 1) }
        val col5 = Array(m + 1) { IntArray(n + 1) }
        val factor2 = Array(m) { IntArray(n) }
        val factor5 = Array(m) { IntArray(n) }
        for (r in 0 until m) {
            for (c in 0 until n) {
                val factorTwo = findFactor(grid[r][c], 2)
                val factorFive = findFactor(grid[r][c], 5)
                row2[r + 1][c + 1] = row2[r + 1][c] + factorTwo
                row5[r + 1][c + 1] = row5[r + 1][c] + factorFive
                col2[r + 1][c + 1] = col2[r][c + 1] + factorTwo
                col5[r + 1][c + 1] = col5[r][c + 1] + factorFive
                factor2[r][c] = factorTwo
                factor5[r][c] = factorFive
            }
        }
        for (r in 0 until m) {
            for (c in 0 until n) {
                val cur2 = factor2[r][c]
                val cur5 = factor5[r][c]
                val up2 = col2[r + 1][c + 1]
                val up5 = col5[r + 1][c + 1]
                val down2 = col2[m][c + 1] - col2[r][c + 1]
                val down5 = col5[m][c + 1] - col5[r][c + 1]
                val left2 = row2[r + 1][c + 1]
                val left5 = row5[r + 1][c + 1]
                val right2 = row2[r + 1][n] - row2[r + 1][c]
                val right5 = row5[r + 1][n] - row5[r + 1][c]
                max = Math.max(max, Math.min(left2 + up2 - cur2, left5 + up5 - cur5))
                max = Math.max(max, Math.min(right2 + up2 - cur2, right5 + up5 - cur5))
                max = Math.max(max, Math.min(left2 + down2 - cur2, left5 + down5 - cur5))
                max = Math.max(max, Math.min(right2 + down2 - cur2, right5 + down5 - cur5))
            }
        }
        return max
    }

    private fun findFactor(a: Int, b: Int): Int {
        var a = a
        var factors = 0
        while (a % b == 0) {
            a /= b
            factors++
        }
        return factors
    }
}
