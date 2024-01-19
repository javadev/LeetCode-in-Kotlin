package g2901_3000.s2980_check_if_bitwise_or_has_trailing_zeros

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun hasTrailingZeros() {
        assertThat(Solution().hasTrailingZeros(intArrayOf(1, 2, 3, 4, 5)), equalTo(true))
    }

    @Test
    fun hasTrailingZeros2() {
        assertThat(Solution().hasTrailingZeros(intArrayOf(2, 4, 8, 16)), equalTo(true))
    }

    @Test
    fun hasTrailingZeros3() {
        assertThat(Solution().hasTrailingZeros(intArrayOf(1, 3, 5, 7, 9)), equalTo(false))
    }
}
