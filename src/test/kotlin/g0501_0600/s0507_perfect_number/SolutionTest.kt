package g0501_0600.s0507_perfect_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkPerfectNumber() {
        assertThat(Solution().checkPerfectNumber(28), equalTo(true))
    }

    @Test
    fun checkPerfectNumber2() {
        assertThat(Solution().checkPerfectNumber(7), equalTo(false))
    }
}
