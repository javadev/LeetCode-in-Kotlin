package g0401_0500.s0409_longest_palindrome

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestPalindrome() {
        assertThat(Solution().longestPalindrome("abccccdd"), equalTo(7))
    }

    @Test
    fun longestPalindrome2() {
        assertThat(Solution().longestPalindrome("a"), equalTo(1))
    }

    @Test
    fun longestPalindrome3() {
        assertThat(Solution().longestPalindrome("bb"), equalTo(2))
    }
}
