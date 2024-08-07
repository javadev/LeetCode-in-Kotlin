package g3201_3300.s3242_design_neighbor_sum_service

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun neighborSum() {
        val neighborSum = NeighborSum(arrayOf(intArrayOf(0, 1, 2), intArrayOf(3, 4, 5), intArrayOf(6, 7, 8)))
        assertThat(neighborSum.adjacentSum(1), equalTo(6))
        assertThat(neighborSum.adjacentSum(4), equalTo(16))
        assertThat(neighborSum.diagonalSum(4), equalTo(16))
        assertThat(neighborSum.diagonalSum(8), equalTo(4))
    }

    @Test
    fun neighborSum2() {
        val neighborSum =
            NeighborSum(
                arrayOf(
                    intArrayOf(1, 2, 0, 3),
                    intArrayOf(4, 7, 15, 6),
                    intArrayOf(8, 9, 10, 11),
                    intArrayOf(12, 13, 14, 5)
                )
            )
        assertThat(neighborSum.adjacentSum(15), equalTo(23))
        assertThat(neighborSum.diagonalSum(9), equalTo(45))
    }
}
