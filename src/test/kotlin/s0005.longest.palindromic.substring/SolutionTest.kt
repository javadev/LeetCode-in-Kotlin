package s0005.longest.palindromic.substring

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class SolutionTest {
    @Test
    fun longestPalindrome() {
        assertThat(Solution().longestPalindrome("babad"), equalTo("aba"))
    }
}
