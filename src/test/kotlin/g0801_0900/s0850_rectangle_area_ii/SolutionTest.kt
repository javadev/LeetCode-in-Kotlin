package g0801_0900.s0850_rectangle_area_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rectangleArea() {
        assertThat(
            Solution()
                .rectangleArea(arrayOf(intArrayOf(0, 0, 2, 2), intArrayOf(1, 0, 2, 3), intArrayOf(1, 0, 3, 1))),
            equalTo(6)
        )
    }

    @Test
    fun rectangleArea2() {
        assertThat(
            Solution().rectangleArea(arrayOf(intArrayOf(0, 0, 1000000000, 1000000000))),
            equalTo(49)
        )
    }
}
