package g3101_3200.s3128_right_triangles

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfRightTriangles() {
        assertThat(
            Solution()
                .numberOfRightTriangles(arrayOf(intArrayOf(0, 1, 0), intArrayOf(0, 1, 1), intArrayOf(0, 1, 0))),
            equalTo(2L)
        )
    }

    @Test
    fun numberOfRightTriangles2() {
        assertThat(
            Solution()
                .numberOfRightTriangles(
                    arrayOf(intArrayOf(1, 0, 0, 0), intArrayOf(0, 1, 0, 1), intArrayOf(1, 0, 0, 0))
                ),
            equalTo(0L)
        )
    }

    @Test
    fun numberOfRightTriangles3() {
        assertThat(
            Solution()
                .numberOfRightTriangles(arrayOf(intArrayOf(1, 0, 1), intArrayOf(1, 0, 0), intArrayOf(1, 0, 0))),
            equalTo(2L)
        )
    }
}
