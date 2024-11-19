package g0101_0200.s0130_surrounded_regions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solve() {
        val board = arrayOf(
            charArrayOf('X', 'X', 'X', 'X'),
            charArrayOf('X', 'O', 'O', 'X'),
            charArrayOf('X', 'X', 'O', 'X'),
            charArrayOf('X', 'O', 'X', 'X'),
        )
        Solution().solve(board)
        assertThat(
            board,
            equalTo(
                arrayOf(
                    charArrayOf('X', 'X', 'X', 'X'),
                    charArrayOf('X', 'X', 'X', 'X'),
                    charArrayOf('X', 'X', 'X', 'X'),
                    charArrayOf('X', 'O', 'X', 'X'),
                ),
            ),
        )
    }

    @Test
    fun solve2() {
        val board = arrayOf(charArrayOf('X'))
        Solution().solve(board)
        assertThat(board, equalTo(arrayOf(charArrayOf('X'))))
    }
}
