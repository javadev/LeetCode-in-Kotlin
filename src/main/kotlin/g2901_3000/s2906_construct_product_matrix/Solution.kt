package g2901_3000.s2906_construct_product_matrix

// #Medium #Array #Matrix #Prefix_Sum #2023_12_27_Time_1016_ms_(100.00%)_Space_97.1_MB_(100.00%)

class Solution {
    fun constructProductMatrix(grid: Array<IntArray>): Array<IntArray> {
        var prod: Long = 1
        val ans = Array(grid.size) { IntArray(grid[0].size) }
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                ans[i][j] = prod.toInt()
                prod = (prod * grid[i][j]) % 12345
            }
        }
        prod = 1
        for (i in grid.indices.reversed()) {
            for (j in grid[0].indices.reversed()) {
                ans[i][j] = (ans[i][j] * prod.toInt()) % 12345
                prod *= grid[i][j].toLong()
                prod %= 12345
            }
        }
        return ans
    }
}
