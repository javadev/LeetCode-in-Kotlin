package g3701_3800.s3736_minimum_moves_to_equal_array_elements_iii

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMoves() {
        assertThat<Int>(Solution().minMoves(intArrayOf(2, 1, 3)), equalTo<Int>(3))
    }

    @Test
    fun minMoves2() {
        assertThat<Int>(Solution().minMoves(intArrayOf(4, 4, 5)), equalTo<Int>(2))
    }
}
