package g2101_2200.s2139_minimum_moves_to_reach_target_score

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMoves() {
        assertThat(Solution().minMoves(5, 0), equalTo(4))
    }

    @Test
    fun minMoves2() {
        assertThat(Solution().minMoves(19, 2), equalTo(7))
    }

    @Test
    fun minMoves3() {
        assertThat(Solution().minMoves(10, 4), equalTo(4))
    }
}
