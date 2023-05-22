package g1001_1100.s1021_remove_outermost_parentheses

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun removeOuterParentheses() {
        assertThat(Solution().removeOuterParentheses("(()())(())"), equalTo("()()()"))
    }

    @Test
    fun removeOuterParentheses2() {
        assertThat(
            Solution().removeOuterParentheses("(()())(())(()(()))"),
            equalTo("()()()()(())")
        )
    }

    @Test
    fun removeOuterParentheses3() {
        assertThat(Solution().removeOuterParentheses("()()"), equalTo(""))
    }
}
