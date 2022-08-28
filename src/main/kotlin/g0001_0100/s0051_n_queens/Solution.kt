package g0001_0100.s0051_n_queens

// #Hard #Top_100_Liked_Questions #Array #Backtracking
// #2022_08_28_Time_280_ms_(88.35%)_Space_41.3_MB_(81.55%)

class Solution {
    fun solveNQueens(N: Int): List<List<String>> {
        val result = mutableListOf<List<String>>()
        val board = Array(N) { CharArray(N) { '.' } }

        fun isValid(row: Int, col: Int): Boolean { // check only top rows and cols
            for (i in 0 until row) {
                if (board[i][col] == 'Q')
                    return false
            }
            // top right
            var (i, j) = row - 1 to col + 1
            while (i >= 0 && j < N) {
                if (board[i--][j++] == 'Q')
                    return false
            }
            // top left
            i = row - 1
            j = col - 1
            while (i >= 0 && j >= 0) {
                if (board[i--][j--] == 'Q')
                    return false
            }
            return true
        }

        fun construct() {
            val list = mutableListOf<String>()
            for (row in board) list.add(String(row))
            result.add(list)
        }

        fun backtrack(row: Int) {
            if (row == N) {
                construct()
                return
            }
            for (col in 0 until N) {
                if (isValid(row, col)) {
                    board[row][col] = 'Q'
                    backtrack(row + 1)
                    board[row][col] = '.'
                }
            }
        }

        backtrack(0)

        return result
    }
}
