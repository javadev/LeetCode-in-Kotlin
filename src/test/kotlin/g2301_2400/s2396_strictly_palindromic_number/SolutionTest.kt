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
}
