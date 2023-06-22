package g2001_2100.s2018_check_if_word_can_be_placed_in_crossword

// #Medium #Array #Matrix #Enumeration
class Solution {
    fun placeWordInCrossword(board: Array<CharArray>, word: String): Boolean {
        val m = board.size
        val n = board[0].size
        for (i in 0 until m) {
            for (j in 0 until n) {
                if ((board[i][j] == ' ' || board[i][j] == word[0]) &&
                    (
                        canPlaceTopDown(word, board, i, j) ||
                            canPlaceLeftRight(word, board, i, j) ||
                            canPlaceBottomUp(word, board, i, j) ||
                            canPlaceRightLeft(word, board, i, j)
                        )
                ) {
                    return true
                }
            }
        }
        return false
    }

    private fun canPlaceRightLeft(word: String, board: Array<CharArray>, row: Int, col: Int): Boolean {
        if (col + 1 < board[0].size &&
            (Character.isLowerCase(board[row][col + 1]) || board[row][col + 1] == ' ')
        ) {
            return false
        }
        var k = 0
        var j = col
        while (j >= 0 && k < word.length) {
            if (board[row][j] != word[k] && board[row][j] != ' ') {
                return false
            } else {
                k++
            }
            j--
        }
        return k == word.length && (j < 0 || board[row][j] == '#')
    }

    private fun canPlaceBottomUp(word: String, board: Array<CharArray>, row: Int, col: Int): Boolean {
        if (row + 1 < board.size &&
            (Character.isLowerCase(board[row + 1][col]) || board[row + 1][col] == ' ')
        ) {
            return false
        }
        var k = 0
        var i = row
        while (i >= 0 && k < word.length) {
            if (board[i][col] != word[k] && board[i][col] != ' ') {
                return false
            } else {
                k++
            }
            i--
        }
        return k == word.length && (i < 0 || board[i][col] == '#')
    }

    private fun canPlaceLeftRight(word: String, board: Array<CharArray>, row: Int, col: Int): Boolean {
        if (col > 0 && (Character.isLowerCase(board[row][col - 1]) || board[row][col - 1] == ' ')) {
            return false
        }
        var k = 0
        var j = col
        while (j < board[0].size && k < word.length) {
            if (board[row][j] != word[k] && board[row][j] != ' ') {
                return false
            } else {
                k++
            }
            j++
        }
        return k == word.length && (j == board[0].size || board[row][j] == '#')
    }

    private fun canPlaceTopDown(word: String, board: Array<CharArray>, row: Int, col: Int): Boolean {
        if (row > 0 && (Character.isLowerCase(board[row - 1][col]) || board[row - 1][col] == ' ')) {
            return false
        }
        var k = 0
        var i = row
        while (i < board.size && k < word.length) {
            if (board[i][col] != word[k] && board[i][col] != ' ') {
                return false
            } else {
                k++
            }
            i++
        }
        return k == word.length && (i == board.size || board[i][col] == '#')
    }
}
