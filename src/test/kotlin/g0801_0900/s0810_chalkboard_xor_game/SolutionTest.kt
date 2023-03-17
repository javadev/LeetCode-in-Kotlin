package g0801_0900.s0810_chalkboard_xor_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun xorGame() {
        assertThat(Solution().xorGame(intArrayOf(1, 1, 2)), equalTo(false))
    }

    @Test
    fun xorGame2() {
        assertThat(Solution().xorGame(intArrayOf(0, 1)), equalTo(true))
    }

    @Test
    fun xorGame3() {
        assertThat(Solution().xorGame(intArrayOf(1, 2, 3)), equalTo(true))
    }
}
