package g2301_2400.s2397_maximum_rows_covered_by_columns

// #Medium #Array #Matrix #Bit_Manipulation #Backtracking #Enumeration
class Solution {
    private var ans = 0
    fun maximumRows(matrix: Array<IntArray>, numSelect: Int): Int {
        dfs(matrix, /*colIndex=*/0, numSelect, /*mask=*/0)
        return ans
    }

    private fun dfs(matrix: Array<IntArray>, colIndex: Int, leftColsCount: Int, mask: Int) {
        if (leftColsCount == 0) {
            ans = Math.max(ans, getAllZerosRowCount(matrix, mask))
            return
        }
        if (colIndex == matrix[0].size) {
            return
        }
        // choose this column
        dfs(matrix, colIndex + 1, leftColsCount - 1, mask or (1 shl colIndex))
        // not choose this column
        dfs(matrix, colIndex + 1, leftColsCount, mask)
    }

    private fun getAllZerosRowCount(matrix: Array<IntArray>, mask: Int): Int {
        var count = 0
        for (row in matrix) {
            var isAllZeros = true
            for (i in row.indices) {
                if (row[i] == 1 && mask shr i and 1 == 0) {
                    isAllZeros = false
                    break
                }
            }
            if (isAllZeros) {
                ++count
            }
        }
        return count
    }
}
