package g2101_2200.s2131_longest_palindrome_by_concatenating_two_letter_words

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestPalindrome() {
        assertThat(Solution().longestPalindrome(arrayOf("lc", "cl", "gg")), equalTo(6))
    }

    @Test
    fun longestPalindrome2() {
        assertThat(
            Solution().longestPalindrome(arrayOf("ab", "ty", "yt", "lc", "cl", "ab")),
            equalTo(8),
        )
    }

    @Test
    fun longestPalindrome3() {
        assertThat(Solution().longestPalindrome(arrayOf("cc", "ll", "xx")), equalTo(2))
    }
}
