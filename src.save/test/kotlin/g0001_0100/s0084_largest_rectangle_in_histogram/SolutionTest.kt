package g0001_0100.s0084_largest_rectangle_in_histogram

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestRectangleArea() {
        assertThat(Solution().largestRectangleArea(intArrayOf(2, 1, 5, 6, 2, 3)), equalTo(10))
    }

    @Test
    fun largestRectangleArea2() {
        assertThat(Solution().largestRectangleArea(intArrayOf(2, 4)), equalTo(4))
    }

    @Test
    fun largestRectangleArea3() {
        assertThat(Solution().largestRectangleArea(intArrayOf()), equalTo(0))
    }
}
