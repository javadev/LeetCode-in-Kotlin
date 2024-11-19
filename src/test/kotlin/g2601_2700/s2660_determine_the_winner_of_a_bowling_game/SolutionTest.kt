package g2601_2700.s2660_determine_the_winner_of_a_bowling_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isWinner() {
        assertThat(
            Solution().isWinner(intArrayOf(4, 10, 7, 9), intArrayOf(6, 5, 2, 3)),
            equalTo(1),
        )
    }

    @Test
    fun isWinner2() {
        assertThat(
            Solution().isWinner(intArrayOf(3, 5, 7, 6), intArrayOf(8, 10, 10, 2)),
            equalTo(2),
        )
    }

    @Test
    fun isWinner3() {
        assertThat(
            Solution().isWinner(intArrayOf(2, 3), intArrayOf(4, 1)),
            equalTo(0),
        )
    }
}
