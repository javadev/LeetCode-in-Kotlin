package g0601_0700.s0647_palindromic_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countSubstrings() {
        assertThat(Solution().countSubstrings("abc"), equalTo(3))
    }

    @Test
    fun countSubstrings2() {
        assertThat(Solution().countSubstrings("aaa"), equalTo(6))
    }
}
