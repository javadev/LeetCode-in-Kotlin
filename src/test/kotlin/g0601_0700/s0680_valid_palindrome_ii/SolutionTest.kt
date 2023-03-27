package g0601_0700.s0680_valid_palindrome_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun validPalindrome() {
        assertThat(Solution().validPalindrome("aba"), equalTo(true))
    }

    @Test
    fun validPalindrome2() {
        assertThat(Solution().validPalindrome("abca"), equalTo(true))
    }

    @Test
    fun validPalindrome3() {
        assertThat(Solution().validPalindrome("abc"), equalTo(false))
    }
}
