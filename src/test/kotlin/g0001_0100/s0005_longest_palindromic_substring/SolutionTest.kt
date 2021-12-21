package g0001_0100.s0005_longest_palindromic_substring

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class SolutionTest {
    @Test
    fun longestPalindrome() {
        assertThat(Solution().longestPalindrome("babad"), equalTo("bab"))
    }
}
