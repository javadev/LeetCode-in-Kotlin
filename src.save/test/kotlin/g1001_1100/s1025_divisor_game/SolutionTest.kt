package g1001_1100.s1025_divisor_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun divisorGame() {
        assertThat(Solution().divisorGame(2), equalTo(true))
    }

    @Test
    fun divisorGame2() {
        assertThat(Solution().divisorGame(3), equalTo(false))
    }
}
