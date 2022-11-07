package g0301_0400.s0301_remove_invalid_parentheses

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import java.util.Arrays

internal class SolutionTest {
    @Test
    fun removeInvalidParentheses() {
        assertThat(
            Solution().removeInvalidParentheses("()())()"),
            equalTo(Arrays.asList("(())()", "()()()"))
        )
    }

    @Test
    fun removeInvalidParentheses2() {
        assertThat(
            Solution().removeInvalidParentheses("(a)())()"),
            equalTo(Arrays.asList("(a())()", "(a)()()"))
        )
    }

    @Test
    fun removeInvalidParentheses3() {
        assertThat(Solution().removeInvalidParentheses(")("), equalTo(Arrays.asList("")))
    }
}
