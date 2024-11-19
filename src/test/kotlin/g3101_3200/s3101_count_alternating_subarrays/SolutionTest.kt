package g3101_3200.s3101_count_alternating_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countAlternatingSubarrays() {
        assertThat(Solution().countAlternatingSubarrays(intArrayOf(0, 1, 1, 1)), equalTo(5L))
    }

    @Test
    fun countAlternatingSubarrays2() {
        assertThat(
            Solution().countAlternatingSubarrays(intArrayOf(1, 0, 1, 0)),
            equalTo(10L),
        )
    }
}
