package g2701_2800.s2742_painting_the_walls

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun paintWalls() {
        assertThat(Solution().paintWalls(intArrayOf(1, 2, 3, 2), intArrayOf(1, 2, 3, 2)), equalTo(3))
    }

    @Test
    fun paintWalls2() {
        assertThat(Solution().paintWalls(intArrayOf(2, 3, 4, 2), intArrayOf(1, 1, 1, 1)), equalTo(4))
    }
}
