package g0801_0900.s0877_stone_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun stoneGame() {
        assertThat(Solution().stoneGame(intArrayOf(5, 3, 4, 5)), equalTo(true))
    }

    @Test
    fun stoneGame2() {
        assertThat(Solution().stoneGame(intArrayOf(3, 7, 2, 3)), equalTo(true))
    }
}
