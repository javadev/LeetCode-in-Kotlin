package g1601_1700.s1605_find_valid_matrix_given_row_and_column_sums

// #Medium #Array #Greedy #Matrix #2023_06_13_Time_574_ms_(100.00%)_Space_49.8_MB_(100.00%)

class Solution {
    fun restoreMatrix(rowSum: IntArray, colSum: IntArray): Array<IntArray> {
        val ans = Array(rowSum.size) { IntArray(colSum.size) }
        for (i in rowSum.indices) {
            for (j in colSum.indices) {
                if (rowSum[i] != 0 && colSum[j] != 0) {
                    ans[i][j] = Math.min(rowSum[i], colSum[j])
                    rowSum[i] -= ans[i][j]
                    colSum[j] -= ans[i][j]
                }
            }
        }
        return ans
    }
}
