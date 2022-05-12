package g0001_0100.s0020_valid_parentheses

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isValid() {
        assertThat(Solution().isValid("()"), equalTo(true))
    }

    @Test
    fun isValid2() {
        assertThat(Solution().isValid("()[]{}"), equalTo(true))
    }

    @Test
    fun isValid3() {
        assertThat(Solution().isValid("(]"), equalTo(false))
    }

    @Test
    fun isValid4() {
        assertThat(Solution().isValid("([)]"), equalTo(false))
    }

    @Test
    fun isValid5() {
        assertThat(Solution().isValid("{[]}"), equalTo(true))
    }
}
