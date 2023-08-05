package g2701_2800.s2732_find_a_good_subset_of_the_matrix

// #Hard #Array #Greedy #Matrix #Bit_Manipulation
// #2023_08_05_Time_760_ms_(98.36%)_Space_71.4_MB_(78.69%)

class Solution {
    fun goodSubsetofBinaryMatrix(grid: Array<IntArray>): List<Int> {
        val m = grid.size
        val n = grid[0].size
        if (m == 1 && grid[0].sum() == 0) {
            return listOf(0)
        }
        val pos = mutableMapOf<Int, Int>()
        for (i in grid.indices) {
            for (mask in 0 until (1 shl n)) {
                var valid = true
                for (j in 0 until n) {
                    if ((mask and (1 shl j)) != 0 && grid[i][j] + 1 > 1) {
                        valid = false
                        break
                    }
                }
                if (valid && mask in pos) {
                    return listOf(pos[mask]!!, i)
                }
            }
            var curr = 0
            for (j in 0 until n) {
                if (grid[i][j] == 1) {
                    curr = curr or (1 shl j)
                }
            }
            pos[curr] = i
        }
        return emptyList()
    }
}
