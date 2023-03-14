package g0701_0800.s0794_valid_tic_tac_toe_state

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validTicTacToe() {
        assertThat(
            Solution().validTicTacToe(arrayOf("O  ", "   ", "   ")), equalTo(false)
        )
    }

    @Test
    fun validTicTacToe2() {
        assertThat(
            Solution().validTicTacToe(arrayOf("XOX", " X ", "   ")), equalTo(false)
        )
    }

    @Test
    fun validTicTacToe3() {
        assertThat(
            Solution().validTicTacToe(arrayOf("XOX", "O O", "XOX")), equalTo(true)
        )
    }
}
