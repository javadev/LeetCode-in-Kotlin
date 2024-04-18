package g3001_3100.s3086_minimum_moves_to_pick_k_ones

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumMoves() {
        assertThat(
            Solution().minimumMoves(intArrayOf(1, 1, 0, 0, 0, 1, 1, 0, 0, 1), 3, 1),
            equalTo(3L)
        )
    }

    @Test
    fun minimumMoves2() {
        assertThat(Solution().minimumMoves(intArrayOf(0, 0, 0, 0), 2, 3), equalTo(4L))
    }

    @Test
    fun minimumMoves3() {
        assertThat(Solution().minimumMoves(intArrayOf(1, 0, 1, 0, 1), 3, 0), equalTo(4L))
    }
}
