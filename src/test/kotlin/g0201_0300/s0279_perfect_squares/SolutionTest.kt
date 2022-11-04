package g0201_0300.s0279_perfect_squares

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSquares() {
        assertThat(Solution().numSquares(12), equalTo(3))
    }

    @Test
    fun numSquares2() {
        assertThat(Solution().numSquares(13), equalTo(2))
    }
}
