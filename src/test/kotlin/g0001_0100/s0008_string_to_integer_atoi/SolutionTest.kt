package g0001_0100.s0008_string_to_integer_atoi

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class SolutionTest {
    @Test
    fun myAtoi() {
        assertThat(Solution().myAtoi("42"), equalTo(42))
    }
}
