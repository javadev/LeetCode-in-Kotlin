package g0801_0900.s0812_largest_triangle_area

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestTriangleArea() {
        assertThat(
            Solution()
                .largestTriangleArea(
                    arrayOf(
                        intArrayOf(0, 0),
                        intArrayOf(0, 1),
                        intArrayOf(1, 0),
                        intArrayOf(0, 2),
                        intArrayOf(2, 0),
                    ),
                ),
            equalTo(2.0),
        )
    }

    @Test
    fun largestTriangleArea2() {
        assertThat(
            Solution().largestTriangleArea(arrayOf(intArrayOf(1, 0), intArrayOf(0, 0), intArrayOf(0, 1))),
            equalTo(0.5),
        )
    }
}
