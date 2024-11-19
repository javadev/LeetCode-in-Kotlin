package g0901_1000.s0950_reveal_cards_in_increasing_order

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun deckRevealedIncreasing() {
        assertThat(
            Solution().deckRevealedIncreasing(intArrayOf(17, 13, 11, 2, 3, 5, 7)),
            equalTo(intArrayOf(2, 13, 3, 11, 5, 17, 7)),
        )
    }

    @Test
    fun deckRevealedIncreasing2() {
        assertThat(
            Solution().deckRevealedIncreasing(intArrayOf(1, 1000)),
            equalTo(intArrayOf(1, 1000)),
        )
    }
}
