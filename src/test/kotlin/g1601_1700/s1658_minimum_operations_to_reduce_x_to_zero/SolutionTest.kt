package g1601_1700.s1658_minimum_operations_to_reduce_x_to_zero

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(Solution().minOperations(intArrayOf(1, 1, 4, 2, 3), 5), equalTo(2))
    }

    @Test
    fun minOperations2() {
        assertThat(Solution().minOperations(intArrayOf(5, 6, 7, 8, 9), 4), equalTo(-1))
    }

    @Test
    fun minOperations3() {
        assertThat(Solution().minOperations(intArrayOf(3, 2, 20, 1, 1, 3), 10), equalTo(5))
    }
}
