package g0401_0500.s0419_battleships_in_a_board

// #Medium #Array #Depth_First_Search #Matrix
// #2022_12_06_Time_273_ms_(76.92%)_Space_41.5_MB_(50.00%)

class Solution {
    fun countBattleships(board: Array<CharArray>?): Int {
        if (board == null || board.size == 0) {
            return 0
        }
        var count = 0
        val m = board.size
        val n = board[0].size
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (board[i][j] != '.' && (j <= 0 || board[i][j - 1] != 'X') &&
                    (i <= 0 || board[i - 1][j] != 'X')
                ) {
                    count++
                }
            }
        }
        return count
    }
}
