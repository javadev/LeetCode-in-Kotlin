package g2701_2800.s2718_sum_of_matrix_after_queries

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun matrixSumQueries() {
        assertThat(
            Solution().matrixSumQueries(
                3,
                arrayOf(
                    intArrayOf(0, 0, 1), intArrayOf(1, 2, 2),
                    intArrayOf(0, 2, 3), intArrayOf(1, 0, 4)
                )
            ),
            equalTo(23)
        )
    }

    @Test
    fun matrixSumQueries2() {
        assertThat(
            Solution().matrixSumQueries(
                3,
                arrayOf(
                    intArrayOf(0, 0, 4), intArrayOf(0, 1, 2),
                    intArrayOf(1, 0, 1), intArrayOf(0, 2, 3), intArrayOf(1, 2, 1)
                )
            ),
            equalTo(17)
        )
    }
}
