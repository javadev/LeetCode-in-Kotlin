package g0101_0200.s0166_fraction_to_recurring_decimal

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun fractionToDecimal() {
        assertThat(Solution().fractionToDecimal(1, 2), equalTo("0.5"))
    }

    @Test
    fun fractionToDecimal2() {
        assertThat(Solution().fractionToDecimal(2, 1), equalTo("2"))
    }

    @Test
    fun fractionToDecimal3() {
        assertThat(Solution().fractionToDecimal(2, 3), equalTo("0.(6)"))
    }

    @Test
    fun fractionToDecimal4() {
        assertThat(Solution().fractionToDecimal(4, 333), equalTo("0.(012)"))
    }

    @Test
    fun fractionToDecimal5() {
        assertThat(Solution().fractionToDecimal(1, 5), equalTo("0.2"))
    }
}
