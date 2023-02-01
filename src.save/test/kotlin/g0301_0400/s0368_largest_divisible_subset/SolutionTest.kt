package g0301_0400.s0368_largest_divisible_subset

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestDivisibleSubset() {
        assertThat(
            Solution().largestDivisibleSubset(intArrayOf(1, 2, 3)),
            equalTo(listOf(2, 1))
        )
    }

    @Test
    fun largestDivisibleSubset2() {
        assertThat(
            Solution().largestDivisibleSubset(intArrayOf(1, 2, 4, 8)),
            equalTo(listOf(8, 4, 2, 1))
        )
    }
}
