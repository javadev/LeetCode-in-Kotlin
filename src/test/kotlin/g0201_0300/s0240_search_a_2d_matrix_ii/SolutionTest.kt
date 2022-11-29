package g0201_0300.s0240_search_a_2d_matrix_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun searchMatrix() {
        val matrix = arrayOf(
            intArrayOf(1, 4, 7, 11, 15), intArrayOf(2, 5, 8, 12, 19), intArrayOf(3, 6, 9, 16, 22),
            intArrayOf(10, 13, 14, 17, 24), intArrayOf(18, 21, 23, 26, 30)
        )
        assertThat(Solution().searchMatrix(matrix, 5), equalTo(true))
    }

    @Test
    fun searchMatrix2() {
        val matrix = arrayOf(
            intArrayOf(1, 4, 7, 11, 15), intArrayOf(2, 5, 8, 12, 19), intArrayOf(3, 6, 9, 16, 22),
            intArrayOf(10, 13, 14, 17, 24), intArrayOf(18, 21, 23, 26, 30)
        )
        assertThat(Solution().searchMatrix(matrix, 20), equalTo(false))
    }
}
