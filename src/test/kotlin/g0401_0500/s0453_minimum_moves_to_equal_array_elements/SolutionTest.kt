package g0401_0500.s0453_minimum_moves_to_equal_array_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMoves() {
        assertThat(Solution().minMoves(intArrayOf(1, 2, 3)), equalTo(3))
    }

    @Test
    fun minMoves2() {
        assertThat(Solution().minMoves(intArrayOf(1, 1, 1)), equalTo(0))
    }
}
