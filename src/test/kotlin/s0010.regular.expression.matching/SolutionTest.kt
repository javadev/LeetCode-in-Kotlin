package s0010.regular.expression.matching

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
