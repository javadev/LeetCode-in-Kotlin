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

    @Test
    fun largestRectangleArea4() {
        assertThat(Solution().largestRectangleArea(intArrayOf(5)), equalTo(5))
    }

    @Test
    fun largestRectangleArea5() {
        assertThat(Solution().largestRectangleArea(intArrayOf(3, 6)), equalTo(6))
    }

    @Test
    fun largestRectangleArea6() {
        assertThat(Solution().largestRectangleArea(intArrayOf(2, 2, 2, 2)), equalTo(8))
    }

    @Test
    fun largestRectangleArea7() {
        assertThat(Solution().largestRectangleArea(intArrayOf(1, 2, 3, 4, 5)), equalTo(9))
    }

    @Test
    fun largestRectangleArea8() {
        assertThat(Solution().largestRectangleArea(intArrayOf(5, 4, 3, 2, 1)), equalTo(9))
    }

    @Test
    fun largestRectangleArea9() {
        assertThat(Solution().largestRectangleArea(intArrayOf(2, 1, 5, 6, 2, 3)), equalTo(10))
    }

    @Test
    fun largestRectangleArea10() {
        assertThat(Solution().largestRectangleArea(intArrayOf(1, 1, 1, 1)), equalTo(4))
    }

    @Test
    fun largestRectangleArea11() {
        assertThat(Solution().largestRectangleArea(intArrayOf()), equalTo(0))
    }
}
