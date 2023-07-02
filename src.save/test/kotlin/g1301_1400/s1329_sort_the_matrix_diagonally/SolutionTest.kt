package g1301_1400.s1329_sort_the_matrix_diagonally

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun diagonalSort() {
        val mat = arrayOf(intArrayOf(3, 3, 1, 1), intArrayOf(2, 2, 1, 2), intArrayOf(1, 1, 1, 2))
        val expected = arrayOf(intArrayOf(1, 1, 1, 1), intArrayOf(1, 2, 2, 2), intArrayOf(1, 2, 3, 3))
        assertThat(Solution().diagonalSort(mat), equalTo(expected))
    }

    @Test
    fun diagonalSort2() {
        val mat = arrayOf(
            intArrayOf(11, 25, 66, 1, 69, 7), intArrayOf(23, 55, 17, 45, 15, 52),
            intArrayOf(75, 31, 36, 44, 58, 8), intArrayOf(22, 27, 33, 25, 68, 4), intArrayOf(84, 28, 14, 11, 5, 50)
        )
        val expected = arrayOf(
            intArrayOf(5, 17, 4, 1, 52, 7), intArrayOf(11, 11, 25, 45, 8, 69),
            intArrayOf(14, 23, 25, 44, 58, 15), intArrayOf(22, 27, 31, 36, 50, 66),
            intArrayOf(84, 28, 75, 33, 55, 68)
        )
        assertThat(Solution().diagonalSort(mat), equalTo(expected))
    }
}
