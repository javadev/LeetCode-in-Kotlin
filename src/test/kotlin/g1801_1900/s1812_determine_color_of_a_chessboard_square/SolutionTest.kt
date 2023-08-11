package g1801_1900.s1812_determine_color_of_a_chessboard_square

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun squareIsWhite() {
        assertThat(Solution().squareIsWhite("a1"), equalTo(false))
    }

    @Test
    fun squareIsWhite2() {
        assertThat(Solution().squareIsWhite("h3"), equalTo(true))
    }

    @Test
    fun squareIsWhite3() {
        assertThat(Solution().squareIsWhite("c7"), equalTo(false))
    }
}
