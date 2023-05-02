package g0801_0900.s0892_surface_area_of_3d_shapes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun surfaceArea() {
        assertThat(Solution().surfaceArea(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))), equalTo(34))
    }

    @Test
    fun surfaceArea2() {
        assertThat(
            Solution().surfaceArea(arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))),
            equalTo(32)
        )
    }

    @Test
    fun surfaceArea3() {
        assertThat(
            Solution().surfaceArea(arrayOf(intArrayOf(2, 2, 2), intArrayOf(2, 1, 2), intArrayOf(2, 2, 2))),
            equalTo(46)
        )
    }
}
