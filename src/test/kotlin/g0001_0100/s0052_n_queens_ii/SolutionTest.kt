package g0001_0100.s0052_n_queens_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun totalNQueens() {
        assertThat(Solution().totalNQueens(4), equalTo(2))
    }

    @Test
    fun totalNQueens2() {
        assertThat(Solution().totalNQueens(1), equalTo(1))
    }
}
