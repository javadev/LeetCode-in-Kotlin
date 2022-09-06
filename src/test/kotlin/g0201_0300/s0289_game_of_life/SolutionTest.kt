package g0201_0300.s0289_game_of_life

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun gameOfLife() {
        val board = arrayOf(intArrayOf(0, 1, 0), intArrayOf(0, 0, 1), intArrayOf(1, 1, 1), intArrayOf(0, 0, 0))
        Solution().gameOfLife(board)
        assertThat(
            board,
            equalTo(
                arrayOf(
                    intArrayOf(0, 0, 0),
                    intArrayOf(1, 0, 1),
                    intArrayOf(0, 1, 1),
                    intArrayOf(0, 1, 0)
                )
            )
        )
    }

    @Test
    fun gameOfLife2() {
        val board = arrayOf(intArrayOf(1, 1), intArrayOf(1, 0))
        Solution().gameOfLife(board)
        assertThat(board, equalTo(arrayOf(intArrayOf(1, 1), intArrayOf(1, 1))))
    }
}
