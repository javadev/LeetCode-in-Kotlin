package g2301_2400.s2384_largest_palindromic_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun largestPalindromic() {
        assertThat(Solution().largestPalindromic("444947137"), equalTo("7449447"))
    }

    @Test
    fun largestPalindromic2() {
        assertThat(Solution().largestPalindromic("00009"), equalTo("9"))
    }
}
