package g0901_1000.s0910_smallest_range_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestRangeII() {
        assertThat(Solution().smallestRangeII(intArrayOf(1), 0), equalTo(0))
    }

    @Test
    fun smallestRangeII2() {
        assertThat(Solution().smallestRangeII(intArrayOf(0, 10), 2), equalTo(6))
    }

    @Test
    fun smallestRangeII3() {
        assertThat(Solution().smallestRangeII(intArrayOf(1, 3, 6), 3), equalTo(3))
    }

}
