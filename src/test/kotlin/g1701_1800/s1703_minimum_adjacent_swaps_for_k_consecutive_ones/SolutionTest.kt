package g1701_1800.s1703_minimum_adjacent_swaps_for_k_consecutive_ones

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMoves() {
        assertThat(Solution().minMoves(intArrayOf(1, 0, 0, 1, 0, 1), 2), equalTo(1))
    }

    @Test
    fun minMoves2() {
        assertThat(Solution().minMoves(intArrayOf(1, 0, 0, 0, 0, 0, 1, 1), 3), equalTo(5))
    }

    @Test
    fun minMoves3() {
        assertThat(Solution().minMoves(intArrayOf(1, 1, 0, 1), 2), equalTo(0))
    }
}
