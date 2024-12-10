package g3301_3400.s3380_maximum_area_rectangle_with_point_constraints_i

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxRectangleArea() {
        assertThat<Int>(
            Solution().maxRectangleArea(
                arrayOf<IntArray>(
                    intArrayOf(1, 1),
                    intArrayOf(1, 3),
                    intArrayOf(3, 1),
                    intArrayOf(3, 3),
                ),
            ),
            CoreMatchers.equalTo<Int>(4),
        )
    }

    @Test
    fun maxRectangleArea2() {
        assertThat<Int>(
            Solution()
                .maxRectangleArea(
                    arrayOf<IntArray>(
                        intArrayOf(1, 1),
                        intArrayOf(1, 3),
                        intArrayOf(3, 1),
                        intArrayOf(3, 3),
                        intArrayOf(2, 2),
                    ),
                ),
            CoreMatchers.equalTo<Int>(-1),
        )
    }

    @Test
    fun maxRectangleArea3() {
        assertThat<Int>(
            Solution()
                .maxRectangleArea(
                    arrayOf<IntArray>(
                        intArrayOf(1, 1),
                        intArrayOf(1, 3),
                        intArrayOf(3, 1),
                        intArrayOf(3, 3),
                        intArrayOf(1, 2),
                        intArrayOf(3, 2),
                    ),
                ),
            CoreMatchers.equalTo<Int>(2),
        )
    }
}
