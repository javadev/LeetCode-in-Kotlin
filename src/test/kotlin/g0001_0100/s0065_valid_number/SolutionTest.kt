package g0001_0100.s0065_valid_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isNumber() {
        assertThat(Solution().isNumber("0"), equalTo(true))
    }

    @Test
    fun isNumber2() {
        assertThat(Solution().isNumber("e"), equalTo(false))
    }

    @Test
    fun isNumber3() {
        assertThat(Solution().isNumber("."), equalTo(false))
    }

    @Test
    fun isNumber4() {
        assertThat(Solution().isNumber(".1"), equalTo(true))
    }

    @Test
    fun isNumber5() {
        assertThat(Solution().isNumber("+.1"), equalTo(true))
    }

    @Test
    fun isNumber6() {
        assertThat(Solution().isNumber("-.1"), equalTo(true))
    }

    @Test
    fun isNumber7() {
        assertThat(Solution().isNumber("++.1"), equalTo(false))
    }

    @Test
    fun isNumber8() {
        assertThat(Solution().isNumber("1e1"), equalTo(true))
    }

    @Test
    fun isNumber9() {
        assertThat(Solution().isNumber("1E1"), equalTo(true))
    }

    @Test
    fun isNumber10() {
        assertThat(Solution().isNumber("1.1E1"), equalTo(true))
    }
}
