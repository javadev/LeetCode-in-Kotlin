package g2001_2100.s2038_remove_colored_pieces_if_both_neighbors_are_the_same_color

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun winnerOfGame() {
        MatcherAssert.assertThat(Solution().winnerOfGame("AAABABB"), CoreMatchers.equalTo(true))
    }

    @Test
    fun winnerOfGame2() {
        MatcherAssert.assertThat(Solution().winnerOfGame("AA"), CoreMatchers.equalTo(false))
    }

    @Test
    fun winnerOfGame3() {
        MatcherAssert.assertThat(Solution().winnerOfGame("ABBBBBBBAAA"), CoreMatchers.equalTo(false))
    }
}
