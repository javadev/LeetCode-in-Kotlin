package g0801_0900.s0856_score_of_parentheses

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun scoreOfParentheses() {
        assertThat(Solution().scoreOfParentheses("()"), equalTo(1))
    }

    @Test
    fun scoreOfParentheses2() {
        assertThat(Solution().scoreOfParentheses("(())"), equalTo(2))
    }

    @Test
    fun scoreOfParentheses3() {
        assertThat(Solution().scoreOfParentheses("()()"), equalTo(2))
    }
}
