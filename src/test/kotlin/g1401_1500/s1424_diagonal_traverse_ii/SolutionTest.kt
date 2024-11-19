package g1401_1500.s1424_diagonal_traverse_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findDiagonalOrder() {
        val input = listOf(mutableListOf(1, 2, 3), mutableListOf(4, 5, 6), mutableListOf(7, 8, 9))
        assertThat(
            Solution().findDiagonalOrder(input),
            equalTo(intArrayOf(1, 4, 2, 7, 5, 3, 8, 6, 9)),
        )
    }

    @Test
    fun findDiagonalOrder2() {
        val input = listOf(
            mutableListOf(1, 2, 3, 4, 5),
            mutableListOf(6, 7),
            mutableListOf(8),
            mutableListOf(9, 10, 11),
            mutableListOf(12, 13, 14, 15, 16),
        )
        assertThat(
            Solution().findDiagonalOrder(input),
            equalTo(intArrayOf(1, 6, 2, 8, 7, 3, 9, 4, 12, 10, 5, 13, 11, 14, 15, 16)),
        )
    }
}
