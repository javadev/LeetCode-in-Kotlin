package g0201_0300.s0224_basic_calculator

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun calculate() {
        assertThat(Solution().calculate("1 + 1"), equalTo(2))
    }

    @Test
    fun calculate2() {
        assertThat(Solution().calculate(" 2-1 + 2 "), equalTo(3))
    }

    @Test
    fun calculate3() {
        assertThat(Solution().calculate("(1+(4+5+2)-3)+(6+8)"), equalTo(23))
    }
}
