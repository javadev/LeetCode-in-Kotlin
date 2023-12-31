package g2901_3000.s2919_minimum_increment_operations_to_make_array_beautiful

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minIncrementOperations() {
        assertThat(
            Solution().minIncrementOperations(intArrayOf(2, 3, 0, 0, 2), 4), equalTo(3L)
        )
    }

    @Test
    fun minIncrementOperations2() {
        assertThat(Solution().minIncrementOperations(intArrayOf(0, 1, 3, 3), 5), equalTo(2L))
    }

    @Test
    fun minIncrementOperations3() {
        assertThat(Solution().minIncrementOperations(intArrayOf(1, 1, 2), 1), equalTo(0L))
    }
}
