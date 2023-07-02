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
}
