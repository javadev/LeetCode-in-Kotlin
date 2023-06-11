package g1501_1600.s1509_minimum_difference_between_largest_and_smallest_value_in_three_moves

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minDifference() {
        MatcherAssert.assertThat(Solution().minDifference(intArrayOf(5, 3, 2, 4)), CoreMatchers.equalTo(0))
    }

    @Test
    fun minDifference2() {
        MatcherAssert.assertThat(Solution().minDifference(intArrayOf(1, 5, 0, 10, 14)), CoreMatchers.equalTo(1))
    }
}
