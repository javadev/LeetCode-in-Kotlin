package g2801_2900.s2841_maximum_sum_of_almost_unique_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSum() {
        assertThat(Solution().maxSum(mutableListOf(2, 6, 7, 3, 1, 7), 3, 4), equalTo(18L))
    }

    @Test
    fun maxSum2() {
        assertThat(Solution().maxSum(mutableListOf(5, 9, 9, 2, 4, 5, 4), 1, 3), equalTo(23L))
    }

    @Test
    fun maxSum3() {
        assertThat(Solution().maxSum(mutableListOf(1, 2, 1, 2, 1, 2, 1), 3, 3), equalTo(0L))
    }
}
