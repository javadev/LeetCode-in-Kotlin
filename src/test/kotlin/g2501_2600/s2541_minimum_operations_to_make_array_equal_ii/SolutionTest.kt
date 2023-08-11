package g2501_2600.s2541_minimum_operations_to_make_array_equal_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(
            Solution().minOperations(intArrayOf(4, 3, 1, 4), intArrayOf(1, 3, 7, 1), 3),
            equalTo(2L)
        )
    }

    @Test
    fun minOperations2() {
        assertThat(
            Solution().minOperations(intArrayOf(3, 8, 5, 2), intArrayOf(2, 4, 1, 6), 1),
            equalTo(-1L)
        )
    }
}
