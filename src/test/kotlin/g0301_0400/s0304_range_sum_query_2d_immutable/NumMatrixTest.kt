package g0301_0400.s0304_range_sum_query_2d_immutable

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class NumMatrixTest {
    @Test
    fun numMatrix() {
        val numMatrix = NumMatrix(
            arrayOf(
                intArrayOf(3, 0, 1, 4, 2),
                intArrayOf(5, 6, 3, 2, 1),
                intArrayOf(1, 2, 0, 1, 5),
                intArrayOf(4, 1, 0, 1, 7),
                intArrayOf(1, 0, 3, 0, 5)
            )
        )
        assertThat(numMatrix.sumRegion(2, 1, 4, 3), equalTo(8))
        assertThat(numMatrix.sumRegion(1, 1, 2, 2), equalTo(11))
        assertThat(numMatrix.sumRegion(1, 2, 2, 4), equalTo(12))
    }
}
