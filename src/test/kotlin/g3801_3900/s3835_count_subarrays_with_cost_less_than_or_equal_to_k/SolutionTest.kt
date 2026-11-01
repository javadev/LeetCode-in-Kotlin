package g3801_3900.s3835_count_subarrays_with_cost_less_than_or_equal_to_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubarrays() {
        assertThat<Long>(
            Solution().countSubarrays(intArrayOf(1, 3, 2), 4),
            equalTo<Long>(5L),
        )
    }

    @Test
    fun countSubarrays2() {
        assertThat<Long>(
            Solution().countSubarrays(intArrayOf(5, 5, 5, 5), 0),
            equalTo<Long>(10L),
        )
    }

    @Test
    fun countSubarrays3() {
        assertThat<Long>(
            Solution().countSubarrays(intArrayOf(1, 2, 3), 0),
            equalTo<Long>(3L),
        )
    }
}
