package g1801_1900.s1823_find_the_winner_of_the_circular_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findTheWinner() {
        assertThat(Solution().findTheWinner(5, 2), equalTo(3))
    }

    @Test
    fun findTheWinner2() {
        assertThat(Solution().findTheWinner(6, 5), equalTo(1))
    }
}
