package g0001_0100.s0020_valid_parentheses

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isValid() {
        val solution = Solution()
        assertThat(solution.isValid("()"), equalTo(true))
        assertThat(solution.isValid("()[]{}"), equalTo(true))
        assertThat(solution.isValid("(]"), equalTo(false))
        assertThat(solution.isValid("([)]"), equalTo(false))
        assertThat(solution.isValid("{[]}"), equalTo(true))
    }
}
