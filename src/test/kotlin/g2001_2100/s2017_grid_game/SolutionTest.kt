package g2001_2100.s2017_grid_game

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun gridGame() {
        MatcherAssert.assertThat(
            Solution().gridGame(arrayOf(intArrayOf(2, 5, 4), intArrayOf(1, 5, 1))),
            CoreMatchers.equalTo(4L)
        )
    }

    @Test
    fun gridGame2() {
        MatcherAssert.assertThat(
            Solution().gridGame(arrayOf(intArrayOf(3, 3, 1), intArrayOf(8, 5, 2))),
            CoreMatchers.equalTo(4L)
        )
    }

    @Test
    fun gridGame3() {
        MatcherAssert.assertThat(
            Solution().gridGame(arrayOf(intArrayOf(1, 3, 1, 15), intArrayOf(1, 3, 3, 1))),
            CoreMatchers.equalTo(7L)
        )
    }
}
