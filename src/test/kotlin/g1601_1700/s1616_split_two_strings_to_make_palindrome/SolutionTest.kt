package g1601_1700.s1616_split_two_strings_to_make_palindrome

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkPalindromeFormation() {
        MatcherAssert.assertThat(Solution().checkPalindromeFormation("x", "y"), CoreMatchers.equalTo(true))
    }

    @Test
    fun checkPalindromeFormation2() {
        MatcherAssert.assertThat(Solution().checkPalindromeFormation("xbdef", "xbdef"), CoreMatchers.equalTo(false))
    }

    @Test
    fun checkPalindromeFormation3() {
        MatcherAssert.assertThat(Solution().checkPalindromeFormation("ulacfd", "jizalu"), CoreMatchers.equalTo(true))
    }
}
