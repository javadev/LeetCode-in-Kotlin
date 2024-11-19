package g0901_1000.s0977_squares_of_a_sorted_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sortedSquares() {
        assertThat(
            Solution().sortedSquares(intArrayOf(-4, -1, 0, 3, 10)),
            equalTo(intArrayOf(0, 1, 9, 16, 100)),
        )
    }

    @Test
    fun sortedSquares2() {
        assertThat(
            Solution().sortedSquares(intArrayOf(-7, -3, 2, 3, 11)),
            equalTo(intArrayOf(4, 9, 9, 49, 121)),
        )
    }
}
