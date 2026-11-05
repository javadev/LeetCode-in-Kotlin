package g3901_4000.s3969_valid_subarrays_with_matching_sum_digits_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countValidSubarrays() {
        assertThat<Int>(
            Solution().countValidSubarrays(intArrayOf(1, 100, 1), 1),
            equalTo<Int>(4),
        )
    }

    @Test
    fun countValidSubarrays2() {
        assertThat<Int>(Solution().countValidSubarrays(intArrayOf(1), 2), equalTo<Int>(0))
    }

    @Test
    fun countValidSubarrays3() {
        assertThat<Int>(
            Solution().countValidSubarrays(intArrayOf(2, 20, 2), 2),
            equalTo<Int>(4),
        )
    }
}
