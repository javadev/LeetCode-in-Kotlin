package g1501_1600.s1509_minimum_difference_between_largest_and_smallest_value_in_three_moves

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDifference() {
        assertThat(Solution().minDifference(intArrayOf(5, 3, 2, 4)), equalTo(0))
    }

    @Test
    fun minDifference2() {
        assertThat(Solution().minDifference(intArrayOf(1, 5, 0, 10, 14)), equalTo(1))
    }
}
