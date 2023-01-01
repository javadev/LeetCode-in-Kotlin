package g0401_0500.s0479_largest_palindrome_product

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestPalindrome() {
        assertThat(Solution().largestPalindrome(2), equalTo(987))
    }

    @Test
    fun largestPalindrome2() {
        assertThat(Solution().largestPalindrome(1), equalTo(9))
    }
}
