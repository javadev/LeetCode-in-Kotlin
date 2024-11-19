package g2901_3000.s2943_maximize_area_of_square_hole_in_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximizeSquareHoleArea() {
        assertThat(
            Solution().maximizeSquareHoleArea(2, 1, intArrayOf(2, 3), intArrayOf(2)),
            equalTo(4),
        )
    }

    @Test
    fun maximizeSquareHoleArea2() {
        assertThat(
            Solution().maximizeSquareHoleArea(1, 1, intArrayOf(2), intArrayOf(2)),
            equalTo(4),
        )
    }

    @Test
    fun maximizeSquareHoleArea3() {
        assertThat(
            Solution().maximizeSquareHoleArea(2, 3, intArrayOf(2, 3), intArrayOf(2, 3, 4)),
            equalTo(9),
        )
    }
}
