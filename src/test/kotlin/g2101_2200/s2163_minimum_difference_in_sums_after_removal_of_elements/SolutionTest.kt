package g2101_2200.s2163_minimum_difference_in_sums_after_removal_of_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumDifference() {
        assertThat(Solution().minimumDifference(intArrayOf(3, 1, 2)), equalTo(-1L))
    }

    @Test
    fun minimumDifference2() {
        assertThat(Solution().minimumDifference(intArrayOf(7, 9, 5, 8, 1, 3)), equalTo(1L))
    }
}
