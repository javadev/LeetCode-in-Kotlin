package g0401_0500.s0498_diagonal_traverse

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findDiagonalOrder() {
        assertThat(
            Solution().findDiagonalOrder(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))),
            equalTo(intArrayOf(1, 2, 4, 7, 5, 3, 6, 8, 9)),
        )
    }

    @Test
    fun findDiagonalOrder2() {
        assertThat(
            Solution().findDiagonalOrder(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))),
            equalTo(intArrayOf(1, 2, 3, 4)),
        )
    }
}
