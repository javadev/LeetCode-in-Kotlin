package g2601_2700.s2679_sum_in_a_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun matrixSum() {
        assertThat(
            Solution().matrixSum(
                arrayOf(
                    intArrayOf(7, 2, 1), intArrayOf(6, 4, 2),
                    intArrayOf(6, 5, 3), intArrayOf(3, 2, 1)
                )
            ),
            equalTo(15)
        )
    }

    @Test
    fun matrixSum2() {
        assertThat(
            Solution().matrixSum(arrayOf(intArrayOf(1))),
            equalTo(1)
        )
    }
}
