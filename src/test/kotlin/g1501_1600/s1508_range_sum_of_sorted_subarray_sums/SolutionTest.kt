package g1501_1600.s1508_range_sum_of_sorted_subarray_sums

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rangeSum() {
        assertThat(Solution().rangeSum(intArrayOf(1, 2, 3, 4), 4, 1, 5), equalTo(13))
    }

    @Test
    fun rangeSum2() {
        assertThat(Solution().rangeSum(intArrayOf(1, 2, 3, 4), 4, 3, 4), equalTo(6))
    }

    @Test
    fun rangeSum3() {
        assertThat(Solution().rangeSum(intArrayOf(1, 2, 3, 4), 4, 1, 10), equalTo(50))
    }
}
