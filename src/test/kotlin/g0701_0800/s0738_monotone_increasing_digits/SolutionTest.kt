package g0701_0800.s0738_monotone_increasing_digits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun monotoneIncreasingDigits() {
        assertThat(Solution().monotoneIncreasingDigits(10), equalTo(9))
    }

    @Test
    fun monotoneIncreasingDigits2() {
        assertThat(Solution().monotoneIncreasingDigits(1234), equalTo(1234))
    }

    @Test
    fun monotoneIncreasingDigits3() {
        assertThat(Solution().monotoneIncreasingDigits(332), equalTo(299))
    }
}
