package g1501_1600.s1572_matrix_diagonal_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun diagonalSum() {
        assertThat(
            Solution().diagonalSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))),
            equalTo(25)
        )
    }

    @Test
    fun diagonalSum2() {
        assertThat(
            Solution()
                .diagonalSum(
                    arrayOf(
                        intArrayOf(1, 1, 1, 1),
                        intArrayOf(1, 1, 1, 1),
                        intArrayOf(1, 1, 1, 1),
                        intArrayOf(1, 1, 1, 1)
                    )
                ),
            equalTo(8)
        )
    }

    @Test
    fun diagonalSum3() {
        assertThat(Solution().diagonalSum(arrayOf(intArrayOf(5))), equalTo(5))
    }
}
