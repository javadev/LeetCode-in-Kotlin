package g3701_3800.s3728_stable_subarrays_with_equal_boundary_and_interior_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countStableSubarrays() {
        assertThat<Long>(
            Solution().countStableSubarrays(intArrayOf(9, 3, 3, 3, 9)),
            equalTo<Long>(2L),
        )
    }

    @Test
    fun countStableSubarrays2() {
        assertThat<Long>(
            Solution().countStableSubarrays(intArrayOf(1, 2, 3, 4, 5)),
            equalTo<Long>(0L),
        )
    }

    @Test
    fun countStableSubarrays3() {
        assertThat<Long>(
            Solution().countStableSubarrays(intArrayOf(-4, 4, 0, 0, -8, -4)),
            equalTo<Long>(1L),
        )
    }
}
