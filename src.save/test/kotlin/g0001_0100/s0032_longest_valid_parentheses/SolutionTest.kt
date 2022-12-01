package g0001_0100.s0032_longest_valid_parentheses

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestValidParentheses() {
        assertThat(Solution().longestValidParentheses("(()"), equalTo(2))
    }

    @Test
    fun longestValidParentheses2() {
        assertThat(Solution().longestValidParentheses(")()())"), equalTo(4))
    }

    @Test
    fun longestValidParentheses3() {
        assertThat(Solution().longestValidParentheses(""), equalTo(0))
    }
}
