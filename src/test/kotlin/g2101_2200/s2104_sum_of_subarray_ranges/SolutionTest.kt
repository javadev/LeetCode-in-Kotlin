package g2101_2200.s2104_sum_of_subarray_ranges

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subArrayRanges() {
        assertThat(Solution().subArrayRanges(intArrayOf(1, 2, 3)), equalTo(4L))
    }

    @Test
    fun subArrayRanges2() {
        assertThat(Solution().subArrayRanges(intArrayOf(1, 3, 3)), equalTo(4L))
    }

    @Test
    fun subArrayRanges3() {
        assertThat(Solution().subArrayRanges(intArrayOf(4, -2, -3, 4, 1)), equalTo(59L))
    }
}
