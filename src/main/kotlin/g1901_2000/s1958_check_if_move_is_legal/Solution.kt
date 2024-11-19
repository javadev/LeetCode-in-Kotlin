package g1901_2000.s1958_check_if_move_is_legal

// #Medium #Array #Matrix #Enumeration #2023_06_21_Time_169_ms_(100.00%)_Space_35.6_MB_(100.00%)

class Solution {
    fun checkMove(board: Array<CharArray>, rMove: Int, cMove: Int, color: Char): Boolean {
        val opposite = if (color == 'W') 'B' else if (color == 'B') 'W' else ' '
        if (opposite == ' ' || !find(board, rMove, cMove, '.')) {
            return false
        }
        for (dir in DIRS) {
            var rNext = rMove + dir[0]
            var cNext = cMove + dir[1]
            if (find(board, rNext, cNext, opposite)) {
                rNext += dir[0]
                cNext += dir[1]
                while (find(board, rNext, cNext, opposite)) {
                    rNext += dir[0]
                    cNext += dir[1]
                }
                if (find(board, rNext, cNext, color)) {
                    return true
                }
            }
        }
        return false
    }

    private fun find(board: Array<CharArray>, r: Int, c: Int, target: Char): Boolean {
        return r >= 0 && r < board.size && c >= 0 && c < board[r].size && board[r][c] == target
    }

    companion object {
        private val DIRS = arrayOf(
            intArrayOf(-1, -1),
            intArrayOf(-1, 0),
            intArrayOf(-1, 1),
            intArrayOf(0, -1),
            intArrayOf(0, 1),
            intArrayOf(1, -1),
            intArrayOf(1, 0),
            intArrayOf(1, 1),
        )
    }
}
