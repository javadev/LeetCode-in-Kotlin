package g0001_0100.s0079_word_search

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Matrix #Backtracking
// #Algorithm_II_Day_11_Recursion_Backtracking #Big_O_Time_O(4^(m*n))_Space_O(m*n)
// #2023_07_10_Time_392_ms_(72.92%)_Space_34.7_MB_(83.33%)

class Solution {
    private fun backtrace(
        board: Array<CharArray>,
        visited: Array<BooleanArray>,
        word: String,
        index: Int,
        x: Int,
        y: Int,
    ): Boolean {
        if (index == word.length) {
            return true
        }
        if (x < 0 || x >= board.size || y < 0 || y >= board[0].size || visited[x][y]) {
            return false
        }
        visited[x][y] = true
        return if (word[index] == board[x][y]) {
            val res = (
                backtrace(board, visited, word, index + 1, x, y + 1) ||
                    backtrace(board, visited, word, index + 1, x, y - 1) ||
                    backtrace(board, visited, word, index + 1, x + 1, y) ||
                    backtrace(board, visited, word, index + 1, x - 1, y)
                )
            if (!res) {
                visited[x][y] = false
            }
            res
        } else {
            visited[x][y] = false
            false
        }
    }

    fun exist(board: Array<CharArray>, word: String): Boolean {
        val visited = Array(board.size) {
            BooleanArray(
                board[0].size,
            )
        }
        for (i in board.indices) {
            for (j in board[0].indices) {
                if (backtrace(board, visited, word, 0, i, j)) {
                    return true
                }
            }
        }
        return false
    }
}
