package g1501_1600.s1510_stone_game_iv

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun winnerSquareGame() {
        assertThat(Solution().winnerSquareGame(1), equalTo(true))
    }

    @Test
    fun winnerSquareGame2() {
        assertThat(Solution().winnerSquareGame(2), equalTo(false))
    }

    @Test
    fun winnerSquareGame3() {
        assertThat(Solution().winnerSquareGame(4), equalTo(true))
    }
}
