package g2101_2200.s2163_minimum_difference_in_sums_after_removal_of_elements

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumDifference() {
        MatcherAssert.assertThat(Solution().minimumDifference(intArrayOf(3, 1, 2)), CoreMatchers.equalTo(-1L))
    }

    @Test
    fun minimumDifference2() {
        MatcherAssert.assertThat(Solution().minimumDifference(intArrayOf(7, 9, 5, 8, 1, 3)), CoreMatchers.equalTo(1L))
    }
}
