package g0601_0700.s0688_knight_probability_in_chessboard

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun knightProbability() {
        assertThat(Solution().knightProbability(3, 2, 0, 0), equalTo(0.06250))
    }

    @Test
    fun knightProbability2() {
        assertThat(Solution().knightProbability(1, 0, 0, 0), equalTo(1.00))
    }
}
