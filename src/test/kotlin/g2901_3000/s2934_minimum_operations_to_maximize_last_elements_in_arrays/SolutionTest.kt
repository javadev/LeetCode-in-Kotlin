package g2901_3000.s2934_minimum_operations_to_maximize_last_elements_in_arrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(
            Solution().minOperations(intArrayOf(1, 2, 7), intArrayOf(4, 5, 3)), equalTo(1)
        )
    }

    @Test
    fun minOperations2() {
        assertThat(
            Solution().minOperations(intArrayOf(2, 3, 4, 5, 9), intArrayOf(8, 8, 4, 4, 4)),
            equalTo(2)
        )
    }

    @Test
    fun minOperations3() {
        assertThat(
            Solution().minOperations(intArrayOf(1, 5, 4), intArrayOf(2, 5, 3)),
            equalTo(-1)
        )
    }
}
