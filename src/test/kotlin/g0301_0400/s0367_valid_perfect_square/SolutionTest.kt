package g0301_0400.s0367_valid_perfect_square

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isPerfectSquare() {
        assertThat(Solution().isPerfectSquare(16), equalTo(true))
    }

    @Test
    fun isPerfectSquare2() {
        assertThat(Solution().isPerfectSquare(14), equalTo(false))
    }
}
