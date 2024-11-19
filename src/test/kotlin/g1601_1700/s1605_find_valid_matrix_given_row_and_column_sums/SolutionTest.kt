package g1601_1700.s1605_find_valid_matrix_given_row_and_column_sums

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun restoreMatrix() {
        assertThat(
            Solution().restoreMatrix(intArrayOf(3, 8), intArrayOf(4, 7)),
            equalTo(arrayOf(intArrayOf(3, 0), intArrayOf(1, 7))),
        )
    }

    @Test
    fun restoreMatrix2() {
        assertThat(
            Solution().restoreMatrix(intArrayOf(5, 7, 10), intArrayOf(8, 6, 8)),
            equalTo(arrayOf(intArrayOf(5, 0, 0), intArrayOf(3, 4, 0), intArrayOf(0, 2, 8))),
        )
    }
}
