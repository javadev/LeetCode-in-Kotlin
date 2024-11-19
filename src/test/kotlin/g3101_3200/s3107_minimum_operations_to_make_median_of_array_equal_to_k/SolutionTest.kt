package g3101_3200.s3107_minimum_operations_to_make_median_of_array_equal_to_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperationsToMakeMedianK() {
        assertThat(
            Solution().minOperationsToMakeMedianK(intArrayOf(2, 5, 6, 8, 5), 4),
            equalTo(2L),
        )
    }

    @Test
    fun minOperationsToMakeMedianK2() {
        assertThat(
            Solution().minOperationsToMakeMedianK(intArrayOf(2, 5, 6, 8, 5), 7),
            equalTo(3L),
        )
    }

    @Test
    fun minOperationsToMakeMedianK3() {
        assertThat(
            Solution().minOperationsToMakeMedianK(intArrayOf(1, 2, 3, 4, 5, 6), 4),
            equalTo(0L),
        )
    }
}
