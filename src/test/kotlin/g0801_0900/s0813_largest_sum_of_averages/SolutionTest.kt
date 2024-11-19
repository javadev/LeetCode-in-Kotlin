package g0801_0900.s0813_largest_sum_of_averages

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestSumOfAverages() {
        assertThat(
            Solution().largestSumOfAverages(intArrayOf(9, 1, 2, 3, 9), 3),
            equalTo(20.0),
        )
    }

    @Test
    fun largestSumOfAverages2() {
        assertThat(
            Solution().largestSumOfAverages(intArrayOf(1, 2, 3, 4, 5, 6, 7), 4),
            equalTo(20.5),
        )
    }
}
