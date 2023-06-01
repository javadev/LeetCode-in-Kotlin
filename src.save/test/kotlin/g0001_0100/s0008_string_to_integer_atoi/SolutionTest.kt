package g0001_0100.s0008_string_to_integer_atoi

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun myAtoi() {
        assertThat(Solution().myAtoi("42"), equalTo(42))
    }

    @Test
    fun myAtoi2() {
        assertThat(Solution().myAtoi("   -42"), equalTo(-42))
    }

    @Test
    fun myAtoi3() {
        assertThat(Solution().myAtoi("4193 with words"), equalTo(4193))
    }

    @Test
    fun myAtoi4() {
        assertThat(Solution().myAtoi("words and 987"), equalTo(0))
    }

    @Test
    fun myAtoi5() {
        assertThat(Solution().myAtoi("-91283472332"), equalTo(-2147483648))
    }
}
