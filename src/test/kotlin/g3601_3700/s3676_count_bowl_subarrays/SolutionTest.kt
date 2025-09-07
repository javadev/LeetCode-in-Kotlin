package g3601_3700.s3676_count_bowl_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun bowlSubarrays() {
        assertThat<Long>(
            Solution().bowlSubarrays(intArrayOf(2, 5, 3, 1, 4)),
            equalTo<Long>(2L),
        )
    }

    @Test
    fun bowlSubarrays2() {
        assertThat<Long>(
            Solution().bowlSubarrays(intArrayOf(5, 1, 2, 3, 4)),
            equalTo<Long>(3L),
        )
    }

    @Test
    fun bowlSubarrays3() {
        assertThat<Long>(
            Solution().bowlSubarrays(intArrayOf(1000000000, 999999999, 999999998)),
            equalTo<Long>(0L),
        )
    }
}
