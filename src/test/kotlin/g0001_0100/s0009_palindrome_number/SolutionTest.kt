package g0001_0100.s0009_palindrome_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat

internal class SolutionTest {
    fun isPalindrome() {
        assertThat(Solution().isPalindrome(121), equalTo(true))
    }

    fun isPalindrome2() {
        assertThat(Solution().isPalindrome(-121), equalTo(false))
    }

    fun isPalindrome3() {
        assertThat(Solution().isPalindrome(10), equalTo(false))
    }
}
