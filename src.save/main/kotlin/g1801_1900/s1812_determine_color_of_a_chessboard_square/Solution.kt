package g1801_1900.s1812_determine_color_of_a_chessboard_square

// #Easy #String #Math #2023_06_19_Time_127_ms_(92.86%)_Space_33.4_MB_(85.71%)

class Solution {
    fun squareIsWhite(coordinates: String): Boolean {
        val x = coordinates[0]
        val y = (coordinates[1].toString() + "").toInt()
        return when (x) {
            'a', 'c', 'e', 'g' -> y % 2 == 0
            else -> y % 2 != 0
        }
    }
}
