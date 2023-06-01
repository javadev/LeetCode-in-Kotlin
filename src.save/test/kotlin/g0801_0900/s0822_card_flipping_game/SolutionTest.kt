package g0801_0900.s0822_card_flipping_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun flipame() {
        assertThat(
            Solution().flipgame(intArrayOf(1, 2, 4, 4, 7), intArrayOf(1, 3, 4, 1, 3)),
            equalTo(2)
        )
    }

    @Test
    fun flipame2() {
        assertThat(Solution().flipgame(intArrayOf(1), intArrayOf(1)), equalTo(0))
    }
}
