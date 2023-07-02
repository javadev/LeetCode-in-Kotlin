package g1901_2000.s1931_painting_a_grid_with_three_different_colors

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun colorTheGrid() {
        assertThat(Solution().colorTheGrid(1, 1), equalTo(3))
    }

    @Test
    fun colorTheGrid2() {
        assertThat(Solution().colorTheGrid(1, 2), equalTo(6))
    }

    @Test
    fun colorTheGrid3() {
        assertThat(Solution().colorTheGrid(5, 5), equalTo(580986))
    }
}
