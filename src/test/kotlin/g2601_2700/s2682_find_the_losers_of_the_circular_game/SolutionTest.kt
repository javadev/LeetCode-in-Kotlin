package g2601_2700.s2682_find_the_losers_of_the_circular_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun circularGameLosers() {
        assertThat(
            Solution().circularGameLosers(5, 2),
            equalTo(intArrayOf(4, 5)),
        )
    }

    @Test
    fun circularGameLosers2() {
        assertThat(
            Solution().circularGameLosers(4, 4),
            equalTo(intArrayOf(2, 3, 4)),
        )
    }
}
