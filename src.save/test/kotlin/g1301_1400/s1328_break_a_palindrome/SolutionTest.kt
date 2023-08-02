package g1301_1400.s1328_break_a_palindrome

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun breakPalindrome() {
        assertThat(Solution().breakPalindrome("abccba"), equalTo("aaccba"))
    }

    @Test
    fun breakPalindrome2() {
        assertThat(Solution().breakPalindrome("a"), equalTo(""))
    }
}
