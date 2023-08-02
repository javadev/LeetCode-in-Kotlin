package g0301_0400.s0390_elimination_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun lastRemaining() {
        assertThat(Solution().lastRemaining(9), equalTo(6))
    }

    @Test
    fun lastRemaining2() {
        assertThat(Solution().lastRemaining(1), equalTo(1))
    }
}
