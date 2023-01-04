package g0101_0200.s0172_factorial_trailing_zeroes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun trailingZeroes() {
        assertThat(Solution().trailingZeroes(3), equalTo(0))
    }

    @Test
    fun trailingZeroes2() {
        assertThat(Solution().trailingZeroes(5), equalTo(1))
    }

    @Test
    fun trailingZeroes3() {
        assertThat(Solution().trailingZeroes(0), equalTo(0))
    }
}
