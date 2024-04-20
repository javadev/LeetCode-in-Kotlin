package g3001_3100.s3097_shortest_subarray_with_or_at_least_k_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumSubarrayLength() {
        assertThat(Solution().minimumSubarrayLength(intArrayOf(1, 2, 3), 2), equalTo(1))
    }

    @Test
    fun minimumSubarrayLength2() {
        assertThat(Solution().minimumSubarrayLength(intArrayOf(2, 1, 8), 10), equalTo(3))
    }

    @Test
    fun minimumSubarrayLength3() {
        assertThat(Solution().minimumSubarrayLength(intArrayOf(1, 2), 0), equalTo(1))
    }
}
