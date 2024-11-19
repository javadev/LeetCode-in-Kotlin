package g0801_0900.s0840_magic_squares_in_grid

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numMagicSquaresInside() {
        assertThat(
            Solution()
                .numMagicSquaresInside(arrayOf(intArrayOf(4, 3, 8, 4), intArrayOf(9, 5, 1, 9), intArrayOf(2, 7, 6, 2))),
            equalTo(1),
        )
    }

    @Test
    fun numMagicSquaresInside2() {
        assertThat(Solution().numMagicSquaresInside(arrayOf(intArrayOf(8))), equalTo(0))
    }
}
