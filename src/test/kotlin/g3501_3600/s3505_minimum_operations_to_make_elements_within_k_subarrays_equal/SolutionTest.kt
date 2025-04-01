package g3501_3600.s3505_minimum_operations_to_make_elements_within_k_subarrays_equal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat<Long>(
            Solution().minOperations(intArrayOf(5, -2, 1, 3, 7, 3, 6, 4, -1), 3, 2),
            equalTo<Long>(8L),
        )
    }

    @Test
    fun minOperations2() {
        assertThat<Long>(
            Solution().minOperations(intArrayOf(9, -2, -2, -2, 1, 5), 2, 2),
            equalTo<Long>(3L),
        )
    }
}
