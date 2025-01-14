package g3401_3500.s3420_count_non_decreasing_subarrays_after_k_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countNonDecreasingSubarrays() {
        assertThat<Long>(
            Solution().countNonDecreasingSubarrays(intArrayOf(6, 3, 1, 2, 4, 4), 7),
            equalTo<Long>(17L),
        )
    }

    @Test
    fun countNonDecreasingSubarrays2() {
        assertThat<Long>(
            Solution().countNonDecreasingSubarrays(intArrayOf(6, 3, 1, 3, 6), 4),
            equalTo<Long>(12L),
        )
    }
}
