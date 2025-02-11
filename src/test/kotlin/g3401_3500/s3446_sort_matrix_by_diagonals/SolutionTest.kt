package g3401_3500.s3446_sort_matrix_by_diagonals

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortMatrix() {
        assertThat<Array<IntArray>>(
            Solution().sortMatrix(arrayOf<IntArray>(intArrayOf(1, 7, 3), intArrayOf(9, 8, 2), intArrayOf(4, 5, 6))),
            equalTo<Array<IntArray>?>(
                arrayOf<IntArray>(
                    intArrayOf(8, 2, 3),
                    intArrayOf(9, 6, 7),
                    intArrayOf(4, 5, 1),
                ),
            ),
        )
    }

    @Test
    fun sortMatrix2() {
        assertThat<Array<IntArray>?>(
            Solution().sortMatrix(arrayOf<IntArray>(intArrayOf(0, 1), intArrayOf(1, 2))),
            equalTo<Array<IntArray>?>(arrayOf<IntArray>(intArrayOf(2, 1), intArrayOf(1, 0))),
        )
    }

    @Test
    fun sortMatrix3() {
        assertThat<Array<IntArray>?>(
            Solution().sortMatrix(arrayOf<IntArray>(intArrayOf(1))),
            equalTo<Array<IntArray>?>(arrayOf<IntArray>(intArrayOf(1))),
        )
    }
}
