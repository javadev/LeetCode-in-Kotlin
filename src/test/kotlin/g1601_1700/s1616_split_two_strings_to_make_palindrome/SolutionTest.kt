package g1601_1700.s1616_split_two_strings_to_make_palindrome

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkPalindromeFormation() {
        assertThat(Solution().checkPalindromeFormation("x", "y"), equalTo(true))
    }

    @Test
    fun checkPalindromeFormation2() {
        assertThat(Solution().checkPalindromeFormation("xbdef", "xbdef"), equalTo(false))
    }

    @Test
    fun checkPalindromeFormation3() {
        assertThat(Solution().checkPalindromeFormation("ulacfd", "jizalu"), equalTo(true))
    }
}
