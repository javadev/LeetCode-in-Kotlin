package g0001_0100.s0059_spiral_matrix_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun generateMatrix() {
        assertThat(
            Solution().generateMatrix(3),
            equalTo(arrayOf(intArrayOf(1, 2, 3), intArrayOf(8, 9, 4), intArrayOf(7, 6, 5))),
        )
    }

    @Test
    fun generateMatrix2() {
        assertThat(Solution().generateMatrix(1), equalTo(arrayOf(intArrayOf(1))))
    }
}
