package g0501_0600.s0592_fraction_addition_and_subtraction

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun fractionAddition() {
        assertThat(Solution().fractionAddition("-1/2+1/2"), equalTo("0/1"))
    }

    @Test
    fun fractionAddition2() {
        assertThat(Solution().fractionAddition("-1/2+1/2+1/3"), equalTo("1/3"))
    }

    @Test
    fun fractionAddition3() {
        assertThat(Solution().fractionAddition("1/3-1/2"), equalTo("-1/6"))
    }
}
