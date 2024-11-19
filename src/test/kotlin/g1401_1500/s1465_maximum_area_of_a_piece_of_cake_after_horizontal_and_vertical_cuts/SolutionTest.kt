package g1401_1500.s1465_maximum_area_of_a_piece_of_cake_after_horizontal_and_vertical_cuts

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxArea() {
        assertThat(
            Solution().maxArea(5, 4, intArrayOf(1, 2, 4), intArrayOf(1, 3)),
            equalTo(4),
        )
    }

    @Test
    fun maxArea2() {
        assertThat(Solution().maxArea(5, 4, intArrayOf(3, 1), intArrayOf(1)), equalTo(6))
    }

    @Test
    fun maxArea3() {
        assertThat(Solution().maxArea(5, 4, intArrayOf(3), intArrayOf(3)), equalTo(9))
    }
}
