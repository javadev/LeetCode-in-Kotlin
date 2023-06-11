package g1501_1600.s1510_stone_game_iv

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun winnerSquareGame() {
        MatcherAssert.assertThat(Solution().winnerSquareGame(1), CoreMatchers.equalTo(true))
    }

    @Test
    fun winnerSquareGame2() {
        MatcherAssert.assertThat(Solution().winnerSquareGame(2), CoreMatchers.equalTo(false))
    }

    @Test
    fun winnerSquareGame3() {
        MatcherAssert.assertThat(Solution().winnerSquareGame(4), CoreMatchers.equalTo(true))
    }
}
