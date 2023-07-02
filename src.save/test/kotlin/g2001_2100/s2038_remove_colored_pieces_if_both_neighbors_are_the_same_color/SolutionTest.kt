package g2001_2100.s2038_remove_colored_pieces_if_both_neighbors_are_the_same_color

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun winnerOfGame() {
        assertThat(Solution().winnerOfGame("AAABABB"), equalTo(true))
    }

    @Test
    fun winnerOfGame2() {
        assertThat(Solution().winnerOfGame("AA"), equalTo(false))
    }

    @Test
    fun winnerOfGame3() {
        assertThat(Solution().winnerOfGame("ABBBBBBBAAA"), equalTo(false))
    }
}
