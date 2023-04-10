package g0801_0900.s0883_projection_area_of_3d_shapes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun projectionArea() {
        assertThat(Solution().projectionArea(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))), equalTo(17))
    }

    @Test
    fun projectionArea2() {
        assertThat(Solution().projectionArea(arrayOf(intArrayOf(2))), equalTo(5))
    }

    @Test
    fun projectionArea3() {
        assertThat(Solution().projectionArea(arrayOf(intArrayOf(1, 0), intArrayOf(0, 2))), equalTo(8))
    }
}
