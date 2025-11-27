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

    @Test
    fun myAtoi6() {
        assertThat(Solution().myAtoi("123"), equalTo(123))
    }

    @Test
    fun myAtoi7() {
        assertThat(Solution().myAtoi("+456"), equalTo(456))
    }

    @Test
    fun myAtoi8() {
        assertThat(Solution().myAtoi("0000123"), equalTo(123))
    }

    @Test
    fun myAtoi9() {
        assertThat(Solution().myAtoi("2147483648"), equalTo(Int.MAX_VALUE))
    }

    @Test
    fun myAtoi10() {
        assertThat(Solution().myAtoi("-2147483649"), equalTo(Int.MIN_VALUE))
    }

    @Test
    fun myAtoi11() {
        assertThat(Solution().myAtoi(""), equalTo(0))
    }

    @Test
    fun myAtoi12() {
        assertThat(Solution().myAtoi("     "), equalTo(0))
    }

    @Test
    fun myAtoi13() {
        assertThat(Solution().myAtoi("+-2"), equalTo(0))
    }

    @Test
    fun myAtoi14() {
        assertThat(Solution().myAtoi("0"), equalTo(0))
    }

    @Test
    fun myAtoi15() {
        assertThat(Solution().myAtoi("-0"), equalTo(0))
    }

    @Test
    fun myAtoi16() {
        assertThat(Solution().myAtoi("words 123"), equalTo(0))
    }

    @Test
    fun myAtoi17() {
        assertThat(Solution().myAtoi("  0000000000012345678abc"), equalTo(12345678))
    }
}
