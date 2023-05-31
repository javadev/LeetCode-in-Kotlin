package g1101_1200.s1106_parsing_a_boolean_expression

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun parseBoolExpr() {
        assertThat(Solution().parseBoolExpr("!(f)"), equalTo(true))
    }

    @Test
    fun parseBoolExpr2() {
        assertThat(Solution().parseBoolExpr("|(f,t)"), equalTo(true))
    }

    @Test
    fun parseBoolExpr3() {
        assertThat(Solution().parseBoolExpr("&(t,f)"), equalTo(false))
    }
}
