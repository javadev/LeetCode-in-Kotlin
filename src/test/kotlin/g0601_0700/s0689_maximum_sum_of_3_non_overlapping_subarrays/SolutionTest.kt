package g0601_0700.s0689_maximum_sum_of_3_non_overlapping_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSumOfThreeSubarrays() {
        assertThat(
            Solution().maxSumOfThreeSubarrays(intArrayOf(1, 2, 1, 2, 6, 7, 5, 1), 2),
            equalTo(intArrayOf(0, 3, 5)),
        )
    }

    @Test
    fun maxSumOfThreeSubarrays2() {
        assertThat(
            Solution().maxSumOfThreeSubarrays(intArrayOf(1, 2, 1, 2, 1, 2, 1, 2, 1), 2),
            equalTo(intArrayOf(0, 2, 4)),
        )
    }
}
