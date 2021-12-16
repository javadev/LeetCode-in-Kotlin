package s0010_regular_expression_matching

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class SolutionTest {
    @Test
    fun isPalindrome() {
        assertThat(Solution().isMatch("aa", "a"), equalTo(false))
        assertThat(Solution().isMatch("aa", "a*"), equalTo(true))
    }
}
