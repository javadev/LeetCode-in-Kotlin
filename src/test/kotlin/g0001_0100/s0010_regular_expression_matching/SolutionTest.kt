package g0001_0100.s0010_regular_expression_matching

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun isPalindrome() {
        assertThat(Solution().isMatch("aa", "a"), equalTo(false))
        assertThat(Solution().isMatch("aa", "a*"), equalTo(true))
    }
}
