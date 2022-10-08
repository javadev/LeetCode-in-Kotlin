package g0101_0200.s0130_surrounded_regions

// #Medium #Top_Interview_Questions #Array #Depth_First_Search #Breadth_First_Search #Matrix
// #Union_Find #Algorithm_II_Day_8_Breadth_First_Search_Depth_First_Search
// #2022_10_08_Time_355_ms_(84.42%)_Space_51.2_MB_(68.83%)

class Solution {
    fun solve(board: Array<CharArray>) {
        // Edge case, empty grid
        if (board.size == 0) {
            return
        }
        // Traverse first and last rows ( boundaries)
        for (i in board[0].indices) {
            // first row
            if (board[0][i] == 'O') {
                // It will covert O and all it's touching O's to #
                dfs(board, 0, i)
            }
            // last row
            if (board[board.size - 1][i] == 'O') {
                // Coverts O's to #'s (same thing as above)
                dfs(board, board.size - 1, i)
            }
        }
        // Traverse first and last Column (boundaries)
        for (i in board.indices) {
            // first Column
            if (board[i][0] == 'O') {
                // Converts O's to #'s
                dfs(board, i, 0)
            }
            // last Column
            if (board[i][board[0].size - 1] == 'O') {
                // Coverts O's to #'s
                dfs(board, i, board[0].size - 1)
            }
        }
        // Traverse through entire matrix
        for (i in board.indices) {
            for (j in board[0].indices) {
                if (board[i][j] == 'O') {
                    // Convert O's to X's
                    board[i][j] = 'X'
                }
                if (board[i][j] == '#') {
                    // Convert #'s to O's
                    board[i][j] = 'O'
                }
            }
        }
    }

    fun dfs(board: Array<CharArray>, row: Int, column: Int) {
        if (row < 0 || row >= board.size || column < 0 || column >= board[0].size || board[row][column] != 'O') {
            return
        }
        board[row][column] = '#'
        dfs(board, row + 1, column)
        dfs(board, row - 1, column)
        dfs(board, row, column + 1)
        dfs(board, row, column - 1)
    }
}
