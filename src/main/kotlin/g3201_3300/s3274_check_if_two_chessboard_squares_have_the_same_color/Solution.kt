package g3201_3300.s3274_check_if_two_chessboard_squares_have_the_same_color

// #Easy #String #Math #2024_09_04_Time_164_ms_(38.64%)_Space_34.3_MB_(81.82%)

class Solution {
    fun checkTwoChessboards(coordinate1: String, coordinate2: String): Boolean {
        val s1 = (coordinate1[0].code - 'a'.code) + (coordinate1[1].code - '0'.code)
        val s2 = (coordinate2[0].code - 'a'.code) + (coordinate2[1].code - '0'.code)
        return s1 % 2 == s2 % 2
    }
}
