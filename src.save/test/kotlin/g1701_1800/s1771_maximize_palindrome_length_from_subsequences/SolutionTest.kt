package g1701_1800.s1771_maximize_palindrome_length_from_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestPalindrome() {
        assertThat(Solution().longestPalindrome("cacb", "cbba"), equalTo(5))
    }

    @Test
    fun longestPalindrome2() {
        assertThat(Solution().longestPalindrome("ab", "ab"), equalTo(3))
    }

    @Test
    fun longestPalindrome3() {
        assertThat(Solution().longestPalindrome("aa", "bb"), equalTo(0))
    }
}
