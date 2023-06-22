package g2001_2100.s2017_grid_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun gridGame() {
        assertThat(
            Solution().gridGame(arrayOf(intArrayOf(2, 5, 4), intArrayOf(1, 5, 1))),
            equalTo(4L)
        )
    }

    @Test
    fun gridGame2() {
        assertThat(
            Solution().gridGame(arrayOf(intArrayOf(3, 3, 1), intArrayOf(8, 5, 2))),
            equalTo(4L)
        )
    }

    @Test
    fun gridGame3() {
        assertThat(
            Solution().gridGame(arrayOf(intArrayOf(1, 3, 1, 15), intArrayOf(1, 3, 3, 1))),
            equalTo(7L)
        )
    }
}
