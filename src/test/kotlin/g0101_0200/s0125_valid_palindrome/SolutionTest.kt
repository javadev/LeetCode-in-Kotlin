package g0101_0200.s0125_valid_palindrome

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isPalindrome() {
        assertThat(Solution().isPalindrome("A man, a plan, a canal: Panama"), equalTo(true))
    }

    @Test
    fun isPalindrome2() {
        assertThat(Solution().isPalindrome("race a car"), equalTo(false))
    }

    @Test
    fun isPalindrome3() {
        assertThat(Solution().isPalindrome(" "), equalTo(true))
    }
}
