package g4001_4100.s4013_count_subarrays_with_even_odd_ratio_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countRatioSubarrays() {
        assertThat<Long>(
            Solution().countRatioSubarrays(intArrayOf(1, 2, 1, 2), 3, 2),
            equalTo<Long>(7L),
        )
    }

    @Test
    fun countRatioSubarrays2() {
        assertThat<Long>(
            Solution().countRatioSubarrays(intArrayOf(2, 2, 1), 2, 1),
            equalTo<Long>(3L),
        )
    }

    @Test
    fun countRatioSubarrays3() {
        assertThat<Long>(
            Solution().countRatioSubarrays(intArrayOf(2, 2, 2), 1, 1),
            equalTo<Long>(0L),
        )
    }
}
