package g0701_0800.s0794_valid_tic_tac_toe_state

// #Medium #Array #String #2023_03_14_Time_138_ms_(100.00%)_Space_33.6_MB_(33.33%)

import kotlin.math.abs

class Solution {
    fun validTicTacToe(board: Array<String>): Boolean {
        // X=1,O=-1,’ ’=0
        var sum = 0
        val winsCol = IntArray(3)
        val winsDig = IntArray(2)
        var xWin = false
        var oWin = false
        for (i in 0..2) {
            val str = board[i]
            var rowSum = 0
            for (j in 0..2) {
                // char chr=str.toCharArray()[j];
                var intchr = 0
                if (str.toCharArray()[j] == 'X') {
                    intchr = 1
                }
                if (str.toCharArray()[j] == 'O') {
                    intchr = -1
                }
                rowSum += intchr
                winsCol[j] += intchr
                if (i == 2 && winsCol[j] == 3) {
                    xWin = true
                }
                if (i == 2 && winsCol[j] == -3) {
                    oWin = true
                }
                if (abs(i - j) != 1) {
                    if (i == j && i == 1) {
                        winsDig[0] += intchr
                        winsDig[1] += intchr
                    } else if (i == j) {
                        winsDig[0] += intchr
                    } else {
                        winsDig[1] += intchr
                    }
                }
                if (i == 2 && winsDig[0].coerceAtLeast(winsDig[1]) == 3) {
                    xWin = true
                }
                if (i == 2 && winsDig[0].coerceAtMost(winsDig[1]) == -3) {
                    oWin = true
                }
            }
            if (rowSum == 3) {
                xWin = true
            }
            if (rowSum == -3) {
                oWin = true
            }
            sum += rowSum
        }
        return if (sum == 0 && !xWin) {
            true
        } else sum == 1 && !oWin
    }
}
