package g0701_0800.s0782_transform_to_chessboard

// #Hard #Array #Math #Matrix #Bit_Manipulation
// #2023_03_12_Time_188_ms_(100.00%)_Space_35.2_MB_(100.00%)

class Solution {
    fun movesToChessboard(board: Array<IntArray>): Int {
        val n = board.size
        var colToMove = 0
        var rowToMove = 0
        var rowOneCnt = 0
        var colOneCnt = 0
        for (ints in board) {
            for (j in 0 until n) {
                if (board[0][0] xor ints[0] xor (ints[j] xor board[0][j]) == 1) {
                    return -1
                }
            }
        }
        for (i in 0 until n) {
            rowOneCnt += board[0][i]
            colOneCnt += board[i][0]
            if (board[i][0] == i % 2) {
                rowToMove++
            }
            if (board[0][i] == i % 2) {
                colToMove++
            }
        }
        if (rowOneCnt < n / 2 || rowOneCnt > (n + 1) / 2) {
            return -1
        }
        if (colOneCnt < n / 2 || colOneCnt > (n + 1) / 2) {
            return -1
        }
        if (n % 2 == 1) {
            // we cannot make it when ..ToMove is odd
            if (colToMove % 2 == 1) {
                colToMove = n - colToMove
            }
            if (rowToMove % 2 == 1) {
                rowToMove = n - rowToMove
            }
        } else {
            colToMove = colToMove.coerceAtMost(n - colToMove)
            rowToMove = rowToMove.coerceAtMost(n - rowToMove)
        }
        return (colToMove + rowToMove) / 2
    }
}
