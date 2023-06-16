package g1501_1600.s1535_find_the_winner_of_an_array_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun winner() {
        assertThat(Solution().getWinner(intArrayOf(2, 1, 3, 5, 4, 6, 7), 2), equalTo(5))
    }

    @Test
    fun winner2() {
        assertThat(Solution().getWinner(intArrayOf(3, 2, 1), 10), equalTo(3))
    }
}
