package g0001_0100.s0009_palindrome_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isPalindrome() {
        assertThat(Solution().isPalindrome(121), equalTo(true))
    }

    @Test
    fun isPalindrome2() {
        assertThat(Solution().isPalindrome(-121), equalTo(false))
    }

    @Test
    fun isPalindrome3() {
        assertThat(Solution().isPalindrome(10), equalTo(false))
    }
}
