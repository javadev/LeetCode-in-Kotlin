package g0301_0400.s0329_longest_increasing_path_in_a_matrix

// #Hard #Dynamic_Programming #Depth_First_Search #Breadth_First_Search #Graph #Memoization
// #Topological_Sort #2022_11_12_Time_322_ms_(92.65%)_Space_39.2_MB_(100.00%)

class Solution {
    fun longestIncreasingPath(matrix: Array<IntArray>): Int {
        var maxIncreasingSequenceCount = 0
        val n = matrix.size - 1
        val m = matrix[0].size - 1
        val memory = Array(n + 1) { IntArray(m + 1) }
        for (i in matrix.indices) {
            for (j in matrix[i].indices) {
                maxIncreasingSequenceCount = Math.max(maxIncreasingSequenceCount, move(i, j, n, m, matrix, memory))
            }
        }
        return maxIncreasingSequenceCount
    }

    private fun move(row: Int, col: Int, n: Int, m: Int, matrix: Array<IntArray>, memory: Array<IntArray>): Int {
        if (memory[row][col] == 0) {
            var count = 1
            // move down
            if (row < n && matrix[row + 1][col] > matrix[row][col]) {
                count = Math.max(count, move(row + 1, col, n, m, matrix, memory) + 1)
            }
            // move right
            if (col < m && matrix[row][col + 1] > matrix[row][col]) {
                count = Math.max(count, move(row, col + 1, n, m, matrix, memory) + 1)
            }
            // move up
            if (row > 0 && matrix[row - 1][col] > matrix[row][col]) {
                count = Math.max(count, move(row - 1, col, n, m, matrix, memory) + 1)
            }
            // move left
            if (col > 0 && matrix[row][col - 1] > matrix[row][col]) {
                count = Math.max(count, move(row, col - 1, n, m, matrix, memory) + 1)
            }
            memory[row][col] = count
        }
        return memory[row][col]
    }
}
