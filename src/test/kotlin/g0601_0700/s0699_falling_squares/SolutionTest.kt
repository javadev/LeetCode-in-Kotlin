package g0601_0700.s0699_falling_squares

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun fallingSquares() {
        assertThat(
            Solution().fallingSquares(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(6, 1))),
            equalTo(listOf(2, 5, 5))
        )
    }

    @Test
    fun fallingSquares2() {
        assertThat(
            Solution().fallingSquares(arrayOf(intArrayOf(100, 100), intArrayOf(200, 100))),
            equalTo(listOf(100, 100))
        )
    }
}
