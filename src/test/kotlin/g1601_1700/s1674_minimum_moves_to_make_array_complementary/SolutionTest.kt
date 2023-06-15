package g1601_1700.s1674_minimum_moves_to_make_array_complementary

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMoves() {
        assertThat(Solution().minMoves(intArrayOf(1, 2, 4, 3), 4), equalTo(1))
    }

    @Test
    fun minMoves2() {
        assertThat(Solution().minMoves(intArrayOf(1, 2, 2, 1), 2), equalTo(2))
    }

    @Test
    fun minMoves3() {
        assertThat(Solution().minMoves(intArrayOf(1, 2, 1, 2), 2), equalTo(0))
    }
}
