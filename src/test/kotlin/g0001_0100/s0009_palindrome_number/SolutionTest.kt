package g0001_0100.s0009_palindrome_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun isPalindrome() {
        assertThat(Solution().isPalindrome(121), equalTo(true))
    }
}
