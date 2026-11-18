package g4001_4100.s4011_count_subarrays_with_even_odd_ratio_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countRatioSubarrays() {
        assertThat<Int>(
            Solution().countRatioSubarrays(intArrayOf(1, 2, 1, 2), 3, 2),
            equalTo<Int>(7),
        )
    }

    @Test
    fun countRatioSubarrays2() {
        assertThat<Int>(
            Solution().countRatioSubarrays(intArrayOf(2, 2, 1), 2, 1),
            equalTo<Int>(3),
        )
    }

    @Test
    fun countRatioSubarrays3() {
        assertThat<Int>(
            Solution().countRatioSubarrays(intArrayOf(2, 2, 2), 1, 1),
            equalTo<Int>(0),
        )
    }
}
