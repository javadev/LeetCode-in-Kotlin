package g0001_0100.s0048_rotate_image

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun rotate() {
        val matrix = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
        val expected = arrayOf(
            intArrayOf(7, 4, 1).toTypedArray(),
            intArrayOf(8, 5, 2).toTypedArray(),
            intArrayOf(9, 6, 3).toTypedArray(),
        )
        Solution().rotate(matrix)
        assertThat(matrix, equalTo(expected))
    }

    @Test
    fun rotate2() {
        val matrix = arrayOf(
            intArrayOf(5, 1, 9, 11),
            intArrayOf(2, 4, 8, 10),
            intArrayOf(13, 3, 6, 7),
            intArrayOf(15, 14, 12, 16),
        )
        val expected = arrayOf(
            intArrayOf(15, 13, 2, 5).toTypedArray(),
            intArrayOf(14, 3, 4, 1).toTypedArray(),
            intArrayOf(12, 6, 8, 9).toTypedArray(),
            intArrayOf(16, 7, 10, 11).toTypedArray(),
        )
        Solution().rotate(matrix)
        assertThat(matrix, equalTo(expected))
    }
}
