package g0001_0100.s0036_valid_sudoku

// #Medium #Top_Interview_Questions #Array #Hash_Table #Matrix #Data_Structure_I_Day_5_Array
// #2022_09_18_Time_346_ms_(65.03%)_Space_45_MB_(70.91%)

class Solution {
    private var j1 = 0
    private val i1 = IntArray(9)
    private val b1 = IntArray(9)
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (i in 0..8) {
            for (j in 0..8) {
                val res = checkValid(board, i, j)
                if (!res) {
                    return false
                }
            }
        }
        return true
    }

    private fun checkValid(board: Array<CharArray>, i: Int, j: Int): Boolean {
        if (j == 0) {
            j1 = 0
        }
        if (board[i][j] == '.') {
            return true
        }
        val `val` = board[i][j] - '0'
        if (j1 == j1 or (1 shl `val` - 1)) {
            return false
        }
        j1 = j1 or (1 shl `val` - 1)
        if (i1[j] == i1[j] or (1 shl `val` - 1)) {
            return false
        }
        i1[j] = i1[j] or (1 shl `val` - 1)
        val b = i / 3 * 3 + j / 3
        if (b1[b] == b1[b] or (1 shl `val` - 1)) {
            return false
        }
        b1[b] = b1[b] or (1 shl `val` - 1)
        return true
    }
}
