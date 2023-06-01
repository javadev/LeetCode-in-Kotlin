package g0401_0500.s0462_minimum_moves_to_equal_array_elements_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMoves2() {
        assertThat(Solution().minMoves2(intArrayOf(1, 2, 3)), equalTo(2))
    }

    @Test
    fun minMoves22() {
        assertThat(Solution().minMoves2(intArrayOf(1, 10, 2, 9)), equalTo(16))
    }
}
