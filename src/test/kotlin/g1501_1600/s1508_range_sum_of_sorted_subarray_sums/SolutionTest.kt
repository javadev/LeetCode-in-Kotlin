package g1501_1600.s1508_range_sum_of_sorted_subarray_sums

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rangeSum() {
        MatcherAssert.assertThat(Solution().rangeSum(intArrayOf(1, 2, 3, 4), 4, 1, 5), CoreMatchers.equalTo(13))
    }

    @Test
    fun rangeSum2() {
        MatcherAssert.assertThat(Solution().rangeSum(intArrayOf(1, 2, 3, 4), 4, 3, 4), CoreMatchers.equalTo(6))
    }

    @Test
    fun rangeSum3() {
        MatcherAssert.assertThat(Solution().rangeSum(intArrayOf(1, 2, 3, 4), 4, 1, 10), CoreMatchers.equalTo(50))
    }
}
