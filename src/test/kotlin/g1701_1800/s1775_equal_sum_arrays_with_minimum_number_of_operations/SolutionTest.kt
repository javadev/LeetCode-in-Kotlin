package g1701_1800.s1775_equal_sum_arrays_with_minimum_number_of_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(
            Solution()
                .minOperations(intArrayOf(1, 2, 3, 4, 5, 6), intArrayOf(1, 1, 2, 2, 2, 2)),
            equalTo(3)
        )
    }

    @Test
    fun minOperations2() {
        assertThat(
            Solution().minOperations(intArrayOf(1, 1, 1, 1, 1, 1, 1), intArrayOf(6)),
            equalTo(-1)
        )
    }

    @Test
    fun minOperations3() {
        assertThat(Solution().minOperations(intArrayOf(6, 6), intArrayOf(1)), equalTo(3))
    }
}
