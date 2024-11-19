package g1201_1300.s1210_minimum_moves_to_reach_target_with_rotations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumMoves() {
        val input = arrayOf(
            intArrayOf(0, 0, 0, 0, 0, 1),
            intArrayOf(1, 1, 0, 0, 1, 0),
            intArrayOf(0, 0, 0, 0, 1, 1),
            intArrayOf(0, 0, 1, 0, 1, 0),
            intArrayOf(0, 1, 1, 0, 0, 0),
            intArrayOf(0, 1, 1, 0, 0, 0),
        )
        assertThat(Solution().minimumMoves(input), equalTo(11))
    }

    @Test
    fun minimumMoves2() {
        val input = arrayOf(
            intArrayOf(0, 0, 1, 1, 1, 1),
            intArrayOf(0, 0, 0, 0, 1, 1),
            intArrayOf(1, 1, 0, 0, 0, 1),
            intArrayOf(1, 1, 1, 0, 0, 1),
            intArrayOf(1, 1, 1, 0, 0, 1),
            intArrayOf(1, 1, 1, 0, 0, 0),
        )
        assertThat(Solution().minimumMoves(input), equalTo(9))
    }
}
