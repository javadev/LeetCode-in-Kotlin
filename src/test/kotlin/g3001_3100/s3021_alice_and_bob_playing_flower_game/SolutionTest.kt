package g3001_3100.s3021_alice_and_bob_playing_flower_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun flowerGame() {
        assertThat(Solution().flowerGame(3, 2), equalTo(3L))
    }

    @Test
    fun flowerGame2() {
        assertThat(Solution().flowerGame(1, 1), equalTo(0L))
    }
}
