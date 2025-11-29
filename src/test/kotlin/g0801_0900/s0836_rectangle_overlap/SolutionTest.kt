package g0801_0900.s0836_rectangle_overlap

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isRectangleOverlap() {
        assertThat(
            Solution().isRectangleOverlap(intArrayOf(0, 0, 2, 2), intArrayOf(1, 1, 3, 3)),
            equalTo(true),
        )
    }

    @Test
    fun isRectangleOverlap2() {
        assertThat(
            Solution().isRectangleOverlap(intArrayOf(0, 0, 1, 1), intArrayOf(1, 0, 2, 1)),
            equalTo(false),
        )
    }

    @Test
    fun isRectangleOverlap3() {
        assertThat(
            Solution().isRectangleOverlap(intArrayOf(0, 0, 1, 1), intArrayOf(2, 2, 3, 3)),
            equalTo(false),
        )
    }

    @Test
    fun isRectangleOverlap4() {
        assertThat(
            Solution().isRectangleOverlap(intArrayOf(0, 0, 2, 2), intArrayOf(0, 2, 2, 4)),
            equalTo(false),
        )
    }

    @Test
    fun isRectangleOverlap5() {
        assertThat(
            Solution().isRectangleOverlap(intArrayOf(1, 1, 3, 3), intArrayOf(1, 0, 3, 1)),
            equalTo(false),
        )
    }

    @Test
    fun isRectangleOverlap6() {
        assertThat(
            Solution().isRectangleOverlap(intArrayOf(-3, -3, -1, -1), intArrayOf(-2, -2, 0, 0)),
            equalTo(true),
        )
    }

    @Test
    fun isRectangleOverlap7() {
        assertThat(
            Solution().isRectangleOverlap(intArrayOf(0, 0, 4, 4), intArrayOf(1, 1, 3, 3)),
            equalTo(true),
        )
    }

    @Test
    fun isRectangleOverlap8() {
        assertThat(
            Solution().isRectangleOverlap(intArrayOf(0, 0, 2, 2), intArrayOf(0, 0, 2, 2)),
            equalTo(true),
        )
    }

    @Test
    fun isRectangleOverlap9() {
        assertThat(
            Solution().isRectangleOverlap(intArrayOf(0, 0, 1, 1), intArrayOf(1, 1, 2, 2)),
            equalTo(false),
        )
    }
}
