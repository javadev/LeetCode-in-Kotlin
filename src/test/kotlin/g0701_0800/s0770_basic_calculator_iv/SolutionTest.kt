package g0701_0800.s0770_basic_calculator_iv

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun basicCalculatorIV() {
        assertThat(
            Solution()
                .basicCalculatorIV("e + 8 - a + 5", arrayOf("e"), intArrayOf(1)),
            equalTo(listOf("-1*a", "14"))
        )
    }

    @Test
    fun basicCalculatorIV2() {
        assertThat(
            Solution()
                .basicCalculatorIV(
                    "e - 8 + temperature - pressure", arrayOf("e", "temperature"), intArrayOf(1, 12)
                ),
            equalTo(listOf("-1*pressure", "5"))
        )
    }

    @Test
    fun basicCalculatorIV3() {
        assertThat(
            Solution()
                .basicCalculatorIV("(e + 8) * (e - 8)", arrayOf(), intArrayOf()),
            equalTo(listOf("1*e*e", "-64"))
        )
    }
}
