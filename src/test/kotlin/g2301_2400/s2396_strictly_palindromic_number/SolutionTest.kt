package g2301_2400.s2396_strictly_palindromic_number

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isStrictlyPalindromic() {
        assertThat(Solution().isStrictlyPalindromic(9), equalTo(false))
    }

    @Test
    fun isStrictlyPalindromic2() {
        assertThat(Solution().isStrictlyPalindromic(4), equalTo(false))
    }

    @Test
    fun isStrictlyPalindromic3() {
        assertThat(Solution().isStrictlyPalindromic(9779), equalTo(false))
    }

    @Test
    fun isStrictlyPalindromic4() {
        assertThat(Solution().isStrictlyPalindromic(3), equalTo(true))
    }

    @Test
    fun isStrictlyPalindromic5() {
        assertThat(Solution().isStrictlyPalindromic(2), equalTo(true))
    }

    @Test
    fun isStrictlyPalindromic6() {
        assertThat(Solution().isStrictlyPalindromic(1), equalTo(true))
    }

    @Test
    fun isStrictlyPalindromic7() {
        assertThat(Solution().isStrictlyPalindromic(10000), equalTo(false))
    }
}
