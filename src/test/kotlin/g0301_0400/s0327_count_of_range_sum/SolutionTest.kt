package g0301_0400.s0327_count_of_range_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countRangeSum() {
        assertThat(Solution().countRangeSum(intArrayOf(-2, 5, -1), -2, 2), equalTo(3))
    }

    @Test
    fun countRangeSum2() {
        assertThat(Solution().countRangeSum(intArrayOf(0), 0, 0), equalTo(1))
    }
}
