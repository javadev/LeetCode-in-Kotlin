package g0601_0700.s0678_valid_parenthesis_string

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkValidString() {
        assertThat(Solution().checkValidString("()"), equalTo(true))
    }

    @Test
    fun checkValidString2() {
        assertThat(Solution().checkValidString("(*)"), equalTo(true))
    }

    @Test
    fun checkValidString3() {
        assertThat(Solution().checkValidString("(*))"), equalTo(true))
    }
}
