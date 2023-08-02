package g1001_1100.s1005_maximize_sum_of_array_after_k_negations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestSumAfterKNegations() {
        assertThat(Solution().largestSumAfterKNegations(intArrayOf(4, 2, 3), 1), equalTo(5))
    }

    @Test
    fun largestSumAfterKNegations2() {
        assertThat(
            Solution().largestSumAfterKNegations(intArrayOf(3, -1, 0, 2), 3), equalTo(6)
        )
    }

    @Test
    fun largestSumAfterKNegations3() {
        assertThat(
            Solution().largestSumAfterKNegations(intArrayOf(2, -3, -1, 5, -4), 2),
            equalTo(13)
        )
    }
}
