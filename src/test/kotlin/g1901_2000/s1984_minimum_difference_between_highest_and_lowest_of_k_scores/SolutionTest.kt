package g1901_2000.s1984_minimum_difference_between_highest_and_lowest_of_k_scores

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumDifference() {
        assertThat(Solution().minimumDifference(intArrayOf(90), 1), equalTo(0))
    }

    @Test
    fun minimumDifference2() {
        assertThat(Solution().minimumDifference(intArrayOf(9, 4, 1, 7), 2), equalTo(2))
    }
}
