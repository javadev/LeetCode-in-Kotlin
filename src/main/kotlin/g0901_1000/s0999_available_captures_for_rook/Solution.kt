package g0901_1000.s0999_available_captures_for_rook

// #Easy #Array #Matrix #Simulation #2025_03_13_Time_0_ms_(100.00%)_Space_40.08_MB_(8.33%)

class Solution {
    fun numRookCaptures(board: Array<CharArray>): Int {
        // Find the position of the rook
        var rookRow = -1
        var rookCol = -1
        for (i in 0..7) {
            for (j in 0..7) {
                if (board[i][j] == 'R') {
                    rookRow = i
                    rookCol = j
                    break
                }
            }
            if (rookRow != -1) {
                break
            }
        }
        // Define the four directions: up, right, down, left
        val directions = arrayOf<IntArray>( // up
            intArrayOf(-1, 0), // right
            intArrayOf(0, 1), // down
            intArrayOf(1, 0), // left
            intArrayOf(0, -1),
        )
        var captureCount = 0
        // Check each direction
        for (dir in directions) {
            var row = rookRow
            var col = rookCol
            while (true) {
                // Move one step in the current direction
                row += dir[0]
                col += dir[1]
                // Check if out of bounds
                if (row < 0 || row >= 8 || col < 0 || col >= 8) {
                    break
                }
                // If we hit a bishop, we're blocked
                if (board[row][col] == 'B') {
                    break
                }
                // If we hit a pawn, we can capture it and then we're blocked
                if (board[row][col] == 'p') {
                    captureCount++
                    break
                }
                // Otherwise (empty square), continue in the same direction
            }
        }
        return captureCount
    }
}
