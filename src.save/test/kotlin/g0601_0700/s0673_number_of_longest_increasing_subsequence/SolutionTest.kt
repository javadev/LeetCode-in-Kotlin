package g0601_0700.s0673_number_of_longest_increasing_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findNumberOfLIS() {
        assertThat(Solution().findNumberOfLIS(intArrayOf(1, 3, 5, 4, 7)), equalTo(2))
    }

    @Test
    fun findNumberOfLIS2() {
        assertThat(Solution().findNumberOfLIS(intArrayOf(2, 2, 2, 2, 2)), equalTo(5))
    }
}
