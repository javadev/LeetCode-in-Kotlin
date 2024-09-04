package g3201_3300.s3274_check_if_two_chessboard_squares_have_the_same_color

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkTwoChessboards() {
        assertThat(Solution().checkTwoChessboards("a1", "c3"), equalTo(true))
    }

    @Test
    fun checkTwoChessboards2() {
        assertThat(Solution().checkTwoChessboards("a1", "h3"), equalTo(false))
    }
}
