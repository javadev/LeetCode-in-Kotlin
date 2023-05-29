package g1101_1200.s1106_parsing_a_boolean_expression

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun parseBoolExpr() {
        MatcherAssert.assertThat(Solution().parseBoolExpr("!(f)"), CoreMatchers.equalTo(true))
    }

    @Test
    fun parseBoolExpr2() {
        MatcherAssert.assertThat(Solution().parseBoolExpr("|(f,t)"), CoreMatchers.equalTo(true))
    }

    @Test
    fun parseBoolExpr3() {
        MatcherAssert.assertThat(Solution().parseBoolExpr("&(t,f)"), CoreMatchers.equalTo(false))
    }
}