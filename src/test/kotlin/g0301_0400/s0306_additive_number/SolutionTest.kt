package g0301_0400.s0306_additive_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isAdditiveNumber() {
        assertThat(Solution().isAdditiveNumber("0235813"), equalTo(false))
    }

    @Test
    fun isAdditiveNumber2() {
        assertThat(Solution().isAdditiveNumber("000"), equalTo(true))
    }

    @Test
    fun isAdditiveNumber3() {
        assertThat(Solution().isAdditiveNumber("011235"), equalTo(true))
    }
}
