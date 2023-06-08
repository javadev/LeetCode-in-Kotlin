package g1201_1300.s1240_tiling_a_rectangle_with_the_fewest_squares

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun tilingRectangle() {
        assertThat(Solution().tilingRectangle(2, 3), equalTo(3))
    }

    @Test
    fun tilingRectangle2() {
        assertThat(Solution().tilingRectangle(5, 8), equalTo(5))
    }

    @Test
    fun tilingRectangle3() {
        assertThat(Solution().tilingRectangle(11, 13), equalTo(6))
    }
}
