package g3701_3800.s3729_count_distinct_subarrays_divisible_by_k_in_sorted_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numGoodSubarrays() {
        assertThat<Long>(
            Solution().numGoodSubarrays(intArrayOf(1, 2, 3), 3),
            equalTo<Long>(3L),
        )
    }

    @Test
    fun numGoodSubarrays2() {
        assertThat<Long>(
            Solution().numGoodSubarrays(intArrayOf(2, 2, 2, 2, 2, 2), 6),
            equalTo<Long>(2L),
        )
    }
}
