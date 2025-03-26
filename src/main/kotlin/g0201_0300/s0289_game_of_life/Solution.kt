package g0201_0300.s0289_game_of_life

// #Medium #Array #Matrix #Simulation #Top_Interview_150_Matrix
// #2022_11_04_Time_174_ms_(96.97%)_Space_34.2_MB_(93.94%)

class Solution {
    companion object {
        var dim: Array<IntArray> = arrayOf(
            intArrayOf(1, 0),
            intArrayOf(0, 1),
            intArrayOf(-1, 0),
            intArrayOf(0, -1),
            intArrayOf(1, 1),
            intArrayOf(1, -1),
            intArrayOf(-1, 1),
            intArrayOf(-1, -1),
        )
    }

    fun gameOfLife(board: Array<IntArray>) {
        for (i in board.indices) {
            for (j in board[0].indices) {
                val com = compute(board, i, j)
                if (board[i][j] == 0) {
                    if (com == 3) {
                        board[i][j] = -1
                    }
                } else if (board[i][j] == 1 && (com < 2 || com > 3)) {
                    board[i][j] = 2
                }
            }
        }

        update(board)
    }

    private fun update(board: Array<IntArray>) {
        for (i in board.indices) {
            for (j in board[0].indices) {
                if (board[i][j] == -1) {
                    board[i][j] = 1
                } else if (board[i][j] == 2) {
                    board[i][j] = 0
                }
            }
        }
    }

    private fun compute(board: Array<IntArray>, r: Int, c: Int): Int {
        var ret = 0
        for (arr in dim) {
            val row = arr[0] + r
            val col = arr[1] + c
            if (row >= 0 && row < board.size && col >= 0 && col < board[0].size &&
                (board[row][col] == 1 || board[row][col] == 2)
            ) {
                ret++
            }
        }
        return ret
    }
}
