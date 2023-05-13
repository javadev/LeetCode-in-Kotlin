package g0901_1000.s0999_available_captures_for_rook

// #Easy #Array #Matrix #Simulation #2023_05_13_Time_143_ms_(80.00%)_Space_34.6_MB_(60.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    private val directions = intArrayOf(0, 1, 0, -1, 0)
    fun numRookCaptures(board: Array<CharArray>): Int {
        val m = board.size
        val n = board[0].size
        var rowR = -1
        var colR = -1
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (board[i][j] == 'R') {
                    rowR = i
                    colR = j
                    break
                }
            }
        }
        val count = intArrayOf(0)
        for (i in 0..3) {
            val neighborRow = rowR + directions[i]
            val neighborCol = colR + directions[i + 1]
            if (neighborRow in 0 until m && neighborCol >= 0 && neighborCol < n &&
                board[neighborRow][neighborCol] != 'B'
            ) {
                if (directions[i] == 0 && directions[i + 1] == 1) {
                    extracted(board, n, count, neighborRow, neighborCol)
                } else if (directions[i] == 1 && directions[i + 1] == 0) {
                    extracted1(board, m, count, neighborRow, neighborCol)
                } else if (directions[i] == 0 && directions[i + 1] == -1) {
                    extracted(board, count, neighborRow, neighborCol)
                } else {
                    extracted1(board, count, neighborRow, neighborCol)
                }
            }
        }
        return count[0]
    }

    private fun extracted(board: Array<CharArray>, count: IntArray, neighborRow: Int, neighborCol: Int) {
        var neighborCol = neighborCol
        while (neighborCol >= 0) {
            if (board[neighborRow][neighborCol] == 'p') {
                count[0]++
                break
            } else if (board[neighborRow][neighborCol] == 'B') {
                break
            } else {
                neighborCol--
            }
        }
    }

    private fun extracted(board: Array<CharArray>, n: Int, count: IntArray, neighborRow: Int, neighborCol: Int) {
        var neighborCol = neighborCol
        while (neighborCol < n) {
            if (board[neighborRow][neighborCol] == 'p') {
                count[0]++
                break
            } else if (board[neighborRow][neighborCol] == 'B') {
                break
            } else {
                neighborCol++
            }
        }
    }

    private fun extracted1(board: Array<CharArray>, count: IntArray, neighborRow: Int, neighborCol: Int) {
        var neighborRow = neighborRow
        while (neighborRow >= 0) {
            if (board[neighborRow][neighborCol] == 'p') {
                count[0]++
                break
            } else if (board[neighborRow][neighborCol] == 'B') {
                break
            } else {
                neighborRow--
            }
        }
    }

    private fun extracted1(board: Array<CharArray>, m: Int, count: IntArray, neighborRow: Int, neighborCol: Int) {
        var neighborRow = neighborRow
        while (neighborRow < m) {
            if (board[neighborRow][neighborCol] == 'p') {
                count[0]++
                break
            } else if (board[neighborRow][neighborCol] == 'B') {
                break
            } else {
                neighborRow++
            }
        }
    }
}
