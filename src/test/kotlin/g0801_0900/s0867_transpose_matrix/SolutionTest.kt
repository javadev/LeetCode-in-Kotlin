package g0801_0900.s0867_transpose_matrix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun transpose() {
        assertThat(
            Solution().transpose(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))),
            equalTo(arrayOf(intArrayOf(1, 4, 7), intArrayOf(2, 5, 8), intArrayOf(3, 6, 9)))
        )
    }

    @Test
    fun transpose2() {
        assertThat(
            Solution().transpose(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6))),
            equalTo(arrayOf(intArrayOf(1, 4), intArrayOf(2, 5), intArrayOf(3, 6)))
        )
    }
}
