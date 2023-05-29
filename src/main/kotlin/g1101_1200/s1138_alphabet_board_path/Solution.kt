package g1101_1200.s1138_alphabet_board_path

// #Medium #String #Hash_Table

class Solution {
    fun alphabetBoardPath(target: String): String {
        if (target.isEmpty()) {
            return ""
        }
        var sourceRow = 0
        var sourceCol = 0
        val path = StringBuilder()
        for (c in target.toCharArray()) {
            val position = c.code - 97
            val targetRow = position / 5
            val targetCol = position % 5
            if (targetCol < sourceCol) {
                path.append(helper("L", sourceCol - targetCol))
            }
            if (targetRow < sourceRow) {
                path.append(helper("U", sourceRow - targetRow))
            }
            if (targetRow > sourceRow) {
                path.append(helper("D", targetRow - sourceRow))
            }
            if (targetCol > sourceCol) {
                path.append(helper("R", targetCol - sourceCol))
            }
            path.append("!")
            sourceRow = targetRow
            sourceCol = targetCol
        }
        return path.toString()
    }

    fun helper(dir: String?, time: Int): StringBuilder {
        val path = StringBuilder()
        for (i in 0 until time) {
            path.append(dir)
        }
        return path
    }
}