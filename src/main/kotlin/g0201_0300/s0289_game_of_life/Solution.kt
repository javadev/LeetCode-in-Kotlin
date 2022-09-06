package g0201_0300.s0289_game_of_life

// #Medium #Top_Interview_Questions #Array #Matrix #Simulation
// #2022_07_06_Time_0_ms_(100.00%)_Space_42.9_MB_(10.73%)
class Solution {
    fun gameOfLife(board: Array<IntArray>) {
        val m = board.size
        val n = board[0].size
        for (i in 0 until m) {
            for (j in 0 until n) {
                val lives = lives(board, i, j, m, n)
                if (board[i][j] == 0 && lives == 3) {
                    board[i][j] = 2
                } else if (board[i][j] == 1 && (lives == 2 || lives == 3)) {
                    board[i][j] = 3
                }
            }
        }
        for (i in 0 until m) {
            for (j in 0 until n) {
                board[i][j] = board[i][j] shr 1
            }
        }
    }

    private fun lives(board: Array<IntArray>, i: Int, j: Int, m: Int, n: Int): Int {
        var lives = 0
        for (r in Math.max(0, i - 1)..Math.min(m - 1, i + 1)) {
            for (c in Math.max(0, j - 1)..Math.min(n - 1, j + 1)) {
                lives += board[r][c] and 1
            }
        }
        lives -= board[i][j] and 1
        return lives
    }
}
