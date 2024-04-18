package g3001_3100.s3091_apply_operations_to_make_sum_of_array_greater_than_or_equal_to_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minOperations() {
        assertThat(Solution().minOperations(11), equalTo(5))
    }

    @Test
    fun minOperations2() {
        assertThat(Solution().minOperations(1), equalTo(0))
    }
}
