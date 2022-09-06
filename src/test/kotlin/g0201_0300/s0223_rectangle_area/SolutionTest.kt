package g0201_0300.s0223_rectangle_area

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rectangleArea() {
        assertThat(Solution().computeArea(-3, 0, 3, 4, 0, -1, 9, 2), equalTo(45))
    }

    @Test
    fun rectangleArea2() {
        assertThat(Solution().computeArea(-2, -2, 2, 2, -2, -2, 2, 2), equalTo(16))
    }
}
