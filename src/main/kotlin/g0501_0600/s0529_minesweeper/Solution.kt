package g0501_0600.s0529_minesweeper

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix
// #2023_01_15_Time_243_ms_(87.50%)_Space_37_MB_(87.50%)

class Solution {
    private var row = 0
    private var col = 0
    private fun dfs(board: Array<CharArray>, row: Int, col: Int) {
        if (row < 0 || row >= this.row || col < 0 || col >= this.col) {
            return
        }
        if (board[row][col] == 'E') {
            val numOfMine = bfs(board, row, col)
            if (numOfMine != 0) {
                board[row][col] = (numOfMine + '0'.toInt()).toChar()
                return
            } else {
                board[row][col] = 'B'
            }
            for (i in DIRECTION) {
                dfs(board, row + i[0], col + i[1])
            }
        }
    }

    private fun bfs(board: Array<CharArray>, row: Int, col: Int): Int {
        var numOfMine = 0
        for (i in DIRECTION) {
            val newRow = row + i[0]
            val newCol = col + i[1]
            if (newRow >= 0 && newRow < this.row && newCol >= 0 && newCol < this.col && board[newRow][newCol] == 'M') {
                numOfMine++
            }
        }
        return numOfMine
    }

    fun updateBoard(board: Array<CharArray>, c: IntArray): Array<CharArray> {
        if (board[c[0]][c[1]] == 'M') {
            board[c[0]][c[1]] = 'X'
            return board
        } else {
            row = board.size
            col = board[0].size
            dfs(board, c[0], c[1])
        }
        return board
    }

    companion object {
        private val DIRECTION = arrayOf(
            intArrayOf(1, 0),
            intArrayOf(-1, 0),
            intArrayOf(0, 1),
            intArrayOf(0, -1),
            intArrayOf(-1, -1),
            intArrayOf(-1, 1),
            intArrayOf(1, -1),
            intArrayOf(1, 1)
        )
    }
}
