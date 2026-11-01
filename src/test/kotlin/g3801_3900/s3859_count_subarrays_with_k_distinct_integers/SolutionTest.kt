package g3801_3900.s3859_count_subarrays_with_k_distinct_integers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubarrays() {
        assertThat<Long>(
            Solution().countSubarrays(intArrayOf(1, 2, 1, 2, 2), 2, 2),
            equalTo<Long>(2L),
        )
    }

    @Test
    fun countSubarrays2() {
        assertThat<Long>(
            Solution().countSubarrays(intArrayOf(3, 1, 2, 4), 2, 1),
            equalTo<Long>(3L),
        )
    }

    @Test
    fun countSubarrays3() {
        assertThat<Long>(
            Solution().countSubarrays(intArrayOf(1, 1, 1), 1, 2),
            equalTo<Long>(3L),
        )
    }
}
