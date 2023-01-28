package g0001_0100.s0052_n_queens_ii

// #Hard #Backtracking #2022_09_21_Time_231_ms_(80.00%)_Space_33.7_MB_(94.29%)

class Solution {
    fun totalNQueens(n: Int): Int {
        val row = BooleanArray(n)
        val col = BooleanArray(n)
        val diagonal = BooleanArray(n + n - 1)
        val antiDiagonal = BooleanArray(n + n - 1)
        return totalNQueens(n, 0, row, col, diagonal, antiDiagonal)
    }

    private fun totalNQueens(
        n: Int,
        r: Int,
        row: BooleanArray,
        col: BooleanArray,
        diagonal: BooleanArray,
        antiDiagonal: BooleanArray
    ): Int {
        if (r == n) {
            return 1
        }
        var count = 0
        for (c in 0 until n) {
            if (!row[r] && !col[c] && !diagonal[r + c] && !antiDiagonal[r - c + n - 1]) {
                antiDiagonal[r - c + n - 1] = true
                diagonal[r + c] = antiDiagonal[r - c + n - 1]
                col[c] = diagonal[r + c]
                row[r] = col[c]
                count += totalNQueens(n, r + 1, row, col, diagonal, antiDiagonal)
                antiDiagonal[r - c + n - 1] = false
                diagonal[r + c] = antiDiagonal[r - c + n - 1]
                col[c] = diagonal[r + c]
                row[r] = col[c]
            }
        }
        return count
    }
}
