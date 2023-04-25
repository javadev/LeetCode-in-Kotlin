package g0801_0900.s0836_rectangle_overlap

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isRectangleOverlap() {
        assertThat(
            Solution().isRectangleOverlap(intArrayOf(0, 0, 2, 2), intArrayOf(1, 1, 3, 3)),
            equalTo(true)
        )
    }

    @Test
    fun isRectangleOverlap2() {
        assertThat(
            Solution().isRectangleOverlap(intArrayOf(0, 0, 1, 1), intArrayOf(1, 0, 2, 1)),
            equalTo(false)
        )
    }

    @Test
    fun isRectangleOverlap3() {
        assertThat(
            Solution().isRectangleOverlap(intArrayOf(0, 0, 1, 1), intArrayOf(2, 2, 3, 3)),
            equalTo(false)
        )
    }
}
