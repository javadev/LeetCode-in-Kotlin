package g1201_1300.s1275_find_winner_on_a_tic_tac_toe_game

// #Easy #Array #Hash_Table #Matrix #Simulation
// #2023_06_08_Time_125_ms_(87.50%)_Space_33.4_MB_(100.00%)

class Solution {
    fun tictactoe(moves: Array<IntArray>): String {
        val board = Array(3) { arrayOfNulls<String>(3) }
        for (i in moves.indices) {
            if (i % 2 == 0) {
                board[moves[i][0]][moves[i][1]] = "X"
            } else {
                board[moves[i][0]][moves[i][1]] = "O"
            }
            if (i > 3 && wins(board) != "") {
                return wins(board)
            }
        }
        return if (moves.size == 9) "Draw" else "Pending"
    }

    private fun wins(board: Array<Array<String?>>): String {
        for (i in 0..2) {
            if (board[i][0] == null) {
                continue
            }
            val str = board[i][0]
            if (str == board[i][1] && str == board[i][2]) {
                return getWinner(str)
            }
        }
        for (j in 0..2) {
            if (board[0][j] == null) {
                continue
            }
            val str = board[0][j]
            if (str == board[1][j] && str == board[2][j]) {
                return getWinner(str)
            }
        }
        if (board[1][1] == null) {
            return ""
        }
        val str = board[1][1]
        return if (str == board[0][0] && str == board[2][2] || str == board[0][2] && str == board[2][0]) {
            getWinner(str)
        } else ""
    }

    private fun getWinner(str: String?): String {
        return if (str == "X") {
            "A"
        } else {
            "B"
        }
    }
}
