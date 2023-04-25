package g0601_0700.s0674_longest_continuous_increasing_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findNumberOfLIS2() {
        assertThat(Solution().findLengthOfLCIS(intArrayOf(1, 3, 5, 4, 7)), equalTo(3))
    }

    @Test
    fun findNumberOfLIS22() {
        assertThat(Solution().findLengthOfLCIS(intArrayOf(2, 2, 2, 2, 2)), equalTo(1))
    }
}
