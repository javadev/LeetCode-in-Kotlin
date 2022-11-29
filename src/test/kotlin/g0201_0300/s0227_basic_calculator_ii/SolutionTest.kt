package g0201_0300.s0227_basic_calculator_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun basicCalculatorII() {
        assertThat(Solution().calculate("3+2*2"), equalTo(7))
    }

    @Test
    fun basicCalculatorII2() {
        assertThat(Solution().calculate(" 3/2 "), equalTo(1))
    }

    @Test
    fun basicCalculatorII3() {
        assertThat(Solution().calculate(" 3+5 / 2 "), equalTo(5))
    }
}
