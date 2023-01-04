package g0301_0400.s0343_integer_break

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun integerBreak() {
        assertThat(Solution().integerBreak(2), equalTo(1))
    }

    @Test
    fun integerBreak2() {
        assertThat(Solution().integerBreak(10), equalTo(36))
    }
}
