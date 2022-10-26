package g0201_0300.s0233_number_of_digit_one

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countDigitOne() {
        assertThat(Solution().countDigitOne(13), equalTo(6))
    }

    @Test
    fun countDigitOne2() {
        assertThat(Solution().countDigitOne(0), equalTo(0))
    }
}
