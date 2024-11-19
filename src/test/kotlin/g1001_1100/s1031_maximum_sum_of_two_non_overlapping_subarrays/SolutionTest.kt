package g1001_1100.s1031_maximum_sum_of_two_non_overlapping_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSumTwoNoOverlap() {
        assertThat(
            Solution().maxSumTwoNoOverlap(intArrayOf(0, 6, 5, 2, 2, 5, 1, 9, 4), 1, 2),
            equalTo(20),
        )
    }

    @Test
    fun maxSumTwoNoOverlap2() {
        assertThat(
            Solution().maxSumTwoNoOverlap(intArrayOf(3, 8, 1, 3, 2, 1, 8, 9, 0), 3, 2),
            equalTo(29),
        )
    }

    @Test
    fun maxSumTwoNoOverlap3() {
        assertThat(
            Solution().maxSumTwoNoOverlap(intArrayOf(2, 1, 5, 6, 0, 9, 5, 0, 3, 8), 4, 3),
            equalTo(31),
        )
    }
}
