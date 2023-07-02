package g0301_0400.s0397_integer_replacement

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun integerReplacement() {
        assertThat(Solution().integerReplacement(8), equalTo(3))
    }

    @Test
    fun integerReplacement2() {
        assertThat(Solution().integerReplacement(7), equalTo(4))
    }

    @Test
    fun integerReplacement3() {
        assertThat(Solution().integerReplacement(4), equalTo(2))
    }
}
