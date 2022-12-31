package g0401_0500.s0473_matchsticks_to_square

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun makeSquare() {
        assertThat(Solution().makesquare(intArrayOf(1, 1, 2, 2, 2)), equalTo(true))
    }

    @Test
    fun makeSquare2() {
        assertThat(Solution().makesquare(intArrayOf(3, 3, 3, 3, 4)), equalTo(false))
    }
}
