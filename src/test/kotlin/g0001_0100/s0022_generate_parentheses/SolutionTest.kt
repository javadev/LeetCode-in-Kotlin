package g0001_0100.s0022_generate_parentheses

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun generateParenthesis() {
        assertThat(
            Solution().generateParenthesis(3),
            equalTo(listOf("((()))", "(()())", "(())()", "()(())", "()()()")),
        )
    }

    @Test
    fun generateParenthesis2() {
        assertThat(Solution().generateParenthesis(1), equalTo(listOf("()")))
    }
}
