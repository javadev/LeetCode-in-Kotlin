package g3001_3100.s3066_minimum_operations_to_exceed_threshold_value_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(Solution().minOperations(intArrayOf(2, 11, 10, 1, 3), 10), equalTo(2))
    }

    @Test
    fun minOperations2() {
        assertThat(Solution().minOperations(intArrayOf(1, 1, 2, 4, 9), 20), equalTo(4))
    }
}
