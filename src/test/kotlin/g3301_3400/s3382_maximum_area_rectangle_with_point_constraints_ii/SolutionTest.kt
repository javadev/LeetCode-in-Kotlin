package g3301_3400.s3382_maximum_area_rectangle_with_point_constraints_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxRectangleArea() {
        assertThat<Long>(
            Solution().maxRectangleArea(intArrayOf(1, 1, 3, 3), intArrayOf(1, 3, 1, 3)),
            equalTo<Long>(4L),
        )
    }

    @Test
    fun maxRectangleArea2() {
        assertThat<Long>(
            Solution()
                .maxRectangleArea(intArrayOf(1, 1, 3, 3, 2), intArrayOf(1, 3, 1, 3, 2)),
            equalTo<Long>(-1L),
        )
    }

    @Test
    fun maxRectangleArea3() {
        assertThat<Long>(
            Solution()
                .maxRectangleArea(
                    intArrayOf(1, 1, 3, 3, 1, 3),
                    intArrayOf(1, 3, 1, 3, 2, 2),
                ),
            equalTo<Long>(2L),
        )
    }
}
