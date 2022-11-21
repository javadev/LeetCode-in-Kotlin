package g0001_0100.s0054_spiral_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun spiralOrder() {
        assertThat(
            Solution().spiralOrder(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))),
            equalTo(
                intArrayOf(1, 2, 3, 6, 9, 8, 7, 4, 5).toList()
            )
        )
    }

    @Test
    fun spiralOrder2() {
        assertThat(
            Solution().spiralOrder(arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(5, 6, 7, 8), intArrayOf(9, 10, 11, 12))),
            equalTo(
                intArrayOf(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7).toList()
            )
        )
    }
}
