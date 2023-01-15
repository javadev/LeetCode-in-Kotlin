package g0501_0600.s0529_minesweeper

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun updateBoard() {
        val input = arrayOf(
            charArrayOf('E', 'E', 'E', 'E', 'E'),
            charArrayOf('E', 'E', 'M', 'E', 'E'),
            charArrayOf('E', 'E', 'E', 'E', 'E'),
            charArrayOf('E', 'E', 'E', 'E', 'E')
        )
        val expected = arrayOf(
            charArrayOf('B', '1', 'E', '1', 'B'),
            charArrayOf('B', '1', 'M', '1', 'B'),
            charArrayOf('B', '1', '1', '1', 'B'),
            charArrayOf('B', 'B', 'B', 'B', 'B')
        )
        assertThat(Solution().updateBoard(input, intArrayOf(3, 0)), equalTo(expected))
    }

    @Test
    fun updateBoard2() {
        val input = arrayOf(
            charArrayOf('B', '1', 'E', '1', 'B'),
            charArrayOf('B', '1', 'M', '1', 'B'),
            charArrayOf('B', '1', '1', '1', 'B'),
            charArrayOf('B', 'B', 'B', 'B', 'B')
        )
        val expected = arrayOf(
            charArrayOf('B', '1', 'E', '1', 'B'),
            charArrayOf('B', '1', 'X', '1', 'B'),
            charArrayOf('B', '1', '1', '1', 'B'),
            charArrayOf('B', 'B', 'B', 'B', 'B')
        )
        assertThat(Solution().updateBoard(input, intArrayOf(1, 2)), equalTo(expected))
    }
}
