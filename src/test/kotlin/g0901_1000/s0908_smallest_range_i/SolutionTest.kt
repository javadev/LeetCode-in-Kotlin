package g0901_1000.s0908_smallest_range_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun smallestRangeI() {
        assertThat(Solution().smallestRangeI(intArrayOf(1), 0), equalTo(0))
    }

    @Test
    fun smallestRangeI2() {
        assertThat(Solution().smallestRangeI(intArrayOf(0, 10), 2), equalTo(6))
    }

    @Test
    fun smallestRangeI3() {
        assertThat(Solution().smallestRangeI(intArrayOf(1, 3, 6), 3), equalTo(0))
    }
}
