package g1901_2000.s1975_maximum_matrix_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxMatrixSum() {
        assertThat(
            Solution().maxMatrixSum(arrayOf(intArrayOf(1, -1), intArrayOf(-1, 1))),
            equalTo(4L),
        )
    }

    @Test
    fun maxMatrixSum2() {
        assertThat(
            Solution().maxMatrixSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(-1, -2, -3), intArrayOf(1, 2, 3))),
            equalTo(16L),
        )
    }
}
