package g1501_1600.s1546_maximum_number_of_non_overlapping_subarrays_with_sum_equals_target

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxNonOverlapping() {
        MatcherAssert.assertThat(Solution().maxNonOverlapping(intArrayOf(1, 1, 1, 1, 1), 2), CoreMatchers.equalTo(2))
    }

    @Test
    fun maxNonOverlapping2() {
        MatcherAssert.assertThat(
            Solution().maxNonOverlapping(intArrayOf(-1, 3, 5, 1, 4, 2, -9), 6), CoreMatchers.equalTo(2)
        )
    }
}
