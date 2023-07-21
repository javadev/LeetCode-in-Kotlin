package g2601_2700.s2660_determine_the_winner_of_a_bowling_game

// #Easy #Array #Simulation #2023_07_21_Time_263_ms_(85.71%)_Space_40.3_MB_(85.71%)

class Solution {
    fun isWinner(player1: IntArray, player2: IntArray): Int {
        var p1Score = 0
        var p2Score = 0
        var isTen = 0
        for (score in player1) {
            p1Score += if (isTen > 0) 2 * score else score
            if (isTen > 0) isTen--
            if (score == 10) isTen = 2
        }
        isTen = 0
        for (score in player2) {
            p2Score += if (isTen > 0) 2 * score else score
            if (isTen > 0) isTen--
            if (score == 10) isTen = 2
        }
        return when {
            p1Score == p2Score -> 0
            p1Score > p2Score -> 1
            else -> 2
        }
    }
}
