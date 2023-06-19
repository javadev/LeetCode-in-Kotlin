package g1901_2000.s1927_sum_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumGame() {
        assertThat(Solution().sumGame("5023"), equalTo(false))
    }

    @Test
    fun sumGame2() {
        assertThat(Solution().sumGame("25??"), equalTo(true))
    }

    @Test
    fun sumGame3() {
        assertThat(Solution().sumGame("?3295???"), equalTo(false))
    }
}
