package g2701_2800.s2778_sum_of_squares_of_special_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfSquares() {
        assertThat(Solution().sumOfSquares(intArrayOf(1, 2, 3, 4)), equalTo(21))
    }

    @Test
    fun sumOfSquares2() {
        assertThat(Solution().sumOfSquares(intArrayOf(2, 7, 1, 19, 18, 3)), equalTo(63))
    }
}
