package g3701_3800.s3776_minimum_moves_to_balance_circular_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMoves() {
        assertThat<Long>(Solution().minMoves(intArrayOf(5, 1, -4)), equalTo<Long>(4L))
    }

    @Test
    fun minMoves2() {
        assertThat<Long>(Solution().minMoves(intArrayOf(1, 2, -5, 2)), equalTo<Long>(6L))
    }

    @Test
    fun minMoves3() {
        assertThat<Long>(Solution().minMoves(intArrayOf(-3, 2)), equalTo<Long>(-1L))
    }
}
