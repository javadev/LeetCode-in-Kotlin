package g2301_2400.s2350_shortest_impossible_sequence_of_rolls

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun shortestSequence() {
        assertThat(
            Solution().shortestSequence(intArrayOf(4, 2, 1, 2, 3, 3, 2, 4, 1), 4),
            equalTo(3)
        )
    }

    @Test
    fun shortestSequence2() {
        assertThat(Solution().shortestSequence(intArrayOf(1, 1, 2, 2), 2), equalTo(2))
    }

    @Test
    fun shortestSequence3() {
        assertThat(
            Solution().shortestSequence(intArrayOf(1, 1, 3, 2, 2, 2, 3, 3), 4), equalTo(1)
        )
    }
}
