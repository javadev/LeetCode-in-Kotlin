package g1501_1600.s1535_find_the_winner_of_an_array_game

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @get:Test
    val winner: Unit
        get() {
            MatcherAssert.assertThat(Solution().getWinner(intArrayOf(2, 1, 3, 5, 4, 6, 7), 2), CoreMatchers.equalTo(5))
        }

    @get:Test
    val winner2: Unit
        get() {
            MatcherAssert.assertThat(Solution().getWinner(intArrayOf(3, 2, 1), 10), CoreMatchers.equalTo(3))
        }
}
