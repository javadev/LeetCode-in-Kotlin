package g2201_2300.s2232_minimize_result_by_adding_parentheses_to_expression

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimizeResult() {
        assertThat(Solution().minimizeResult("247+38"), equalTo("2(47+38)"))
    }

    @Test
    fun minimizeResult2() {
        assertThat(Solution().minimizeResult("12+34"), equalTo("1(2+3)4"))
    }

    @Test
    fun minimizeResult3() {
        assertThat(Solution().minimizeResult("999+999"), equalTo("(999+999)"))
    }
}
