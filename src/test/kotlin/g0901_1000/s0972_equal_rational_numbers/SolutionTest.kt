package g0901_1000.s0972_equal_rational_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isRationalEqual() {
        assertThat(Solution().isRationalEqual("0.(52)", "0.5(25)"), equalTo(true))
    }

    @Test
    fun isRationalEqual2() {
        assertThat(Solution().isRationalEqual("0.1666(6)", "0.166(66)"), equalTo(true))
    }

    @Test
    fun isRationalEqual3() {
        assertThat(Solution().isRationalEqual("0.9(9)", "1."), equalTo(true))
    }

    @Test
    fun isRationalEqual4() {
        assertThat(Solution().isRationalEqual("3.14", "3.14"), equalTo(true))
    }

    @Test
    fun isRationalEqual5() {
        assertThat(Solution().isRationalEqual("3.14", "3.15"), equalTo(false))
    }

    @Test
    fun isRationalEqual6() {
        assertThat(Solution().isRationalEqual("0.(3)", "0.3333333333"), equalTo(true))
    }

    @Test
    fun isRationalEqual7() {
        assertThat(Solution().isRationalEqual("0.(12)", "0.(13)"), equalTo(false))
    }

    @Test
    fun isRationalEqual8() {
        assertThat(Solution().isRationalEqual("1.(0)", "1."), equalTo(true))
    }

    @Test
    fun isRationalEqual9() {
        assertThat(Solution().isRationalEqual("0.(987654321)", "0.(987654321)"), equalTo(true))
    }

    @Test
    fun isRationalEqual10() {
        assertThat(Solution().isRationalEqual("42", "42"), equalTo(true))
    }

    @Test
    fun isRationalEqual11() {
        assertThat(Solution().isRationalEqual("42", "42.0"), equalTo(true))
    }

    @Test
    fun isRationalEqual12() {
        assertThat(Solution().isRationalEqual("0.(1)", "0.(2)"), equalTo(false))
    }
}
