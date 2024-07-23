package g3201_3300.s3222_find_the_winning_player_in_coin_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun losingPlayer() {
        assertThat(Solution().losingPlayer(2, 7), equalTo("Alice"))
    }

    @Test
    fun losingPlayer2() {
        assertThat(Solution().losingPlayer(4, 11), equalTo("Bob"))
    }
}
