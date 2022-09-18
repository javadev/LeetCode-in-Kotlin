package g0001_0100.s0037_sudoku_solver

// #Hard #Array #Matrix #Backtracking #2022_09_18_Time_294_ms_(79.69%)_Space_34.8_MB_(93.75%)

class Solution {
    private val emptyCells: MutableList<IntArray> = ArrayList()
    private val rows = IntArray(9)
    private val cols = IntArray(9)
    private val boxes = IntArray(9)
    fun solveSudoku(board: Array<CharArray>) {
        for (r in 0..8) {
            for (c in 0..8) {
                if (board[r][c] == '.') {
                    emptyCells.add(intArrayOf(r, c))
                } else {
                    val `val` = board[r][c] - '0'
                    val boxPos = r / 3 * 3 + c / 3
                    rows[r] = rows[r] or (1 shl `val`)
                    cols[c] = cols[c] or (1 shl `val`)
                    boxes[boxPos] = boxes[boxPos] or (1 shl `val`)
                }
            }
        }
        backtracking(board, 0)
    }

    private fun backtracking(board: Array<CharArray>, i: Int): Boolean {
        // Check if we filled all empty cells?
        if (i == emptyCells.size) {
            return true
        }
        val r = emptyCells[i][0]
        val c = emptyCells[i][1]
        val boxPos = r / 3 * 3 + c / 3
        for (`val` in 1..9) {
            // skip if that value is existed!
            if (hasBit(rows[r], `val`) || hasBit(cols[c], `val`) || hasBit(boxes[boxPos], `val`)) {
                continue
            }
            board[r][c] = ('0' + `val`)
            // backup old values
            val oldRow = rows[r]
            val oldCol = cols[c]
            val oldBox = boxes[boxPos]
            rows[r] = rows[r] or (1 shl `val`)
            cols[c] = cols[c] or (1 shl `val`)
            boxes[boxPos] = boxes[boxPos] or (1 shl `val`)
            if (backtracking(board, i + 1)) {
                return true
            }
            rows[r] = oldRow
            cols[c] = oldCol
            boxes[boxPos] = oldBox
        }
        return false
    }

    private fun hasBit(x: Int, k: Int): Boolean {
        return x shr k and 1 == 1
    }
}
