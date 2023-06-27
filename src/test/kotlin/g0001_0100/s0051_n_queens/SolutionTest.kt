package g0001_0100.s0051_n_queens

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun solveNQueens() {
        assertThat(
            Solution().solveNQueens(4),
            equalTo(
                arrayOf(
                    arrayOf(".Q..", "...Q", "Q...", "..Q.").toList(),
                    arrayOf("..Q.", "Q...", "...Q", ".Q..").toList()
                ).toList()
            )
        )
    }

    @Test
    fun solveNQueens2() {
        assertThat(Solution().solveNQueens(1), equalTo(arrayOf(arrayOf("Q").toList()).toList()))
    }
}
