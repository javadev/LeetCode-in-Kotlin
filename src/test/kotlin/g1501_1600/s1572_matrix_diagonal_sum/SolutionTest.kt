package g1501_1600.s1572_matrix_diagonal_sum

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun diagonalSum() {
        MatcherAssert.assertThat(
            Solution().diagonalSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))),
            CoreMatchers.equalTo(25)
        )
    }

    @Test
    fun diagonalSum2() {
        MatcherAssert.assertThat(
            Solution()
                .diagonalSum(
                    arrayOf(
                        intArrayOf(1, 1, 1, 1),
                        intArrayOf(1, 1, 1, 1),
                        intArrayOf(1, 1, 1, 1),
                        intArrayOf(1, 1, 1, 1)
                    )
                ),
            CoreMatchers.equalTo(8)
        )
    }

    @Test
    fun diagonalSum3() {
        MatcherAssert.assertThat(Solution().diagonalSum(arrayOf(intArrayOf(5))), CoreMatchers.equalTo(5))
    }
}
