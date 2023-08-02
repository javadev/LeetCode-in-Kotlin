package g1201_1300.s1277_count_square_submatrices_with_all_ones

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSquares() {
        assertThat(
            Solution().countSquares(arrayOf(intArrayOf(0, 1, 1, 1), intArrayOf(1, 1, 1, 1), intArrayOf(0, 1, 1, 1))),
            equalTo(15)
        )
    }

    @Test
    fun countSquares2() {
        assertThat(
            Solution().countSquares(arrayOf(intArrayOf(1, 0, 1), intArrayOf(1, 1, 0), intArrayOf(1, 1, 0))),
            equalTo(7)
        )
    }
}
