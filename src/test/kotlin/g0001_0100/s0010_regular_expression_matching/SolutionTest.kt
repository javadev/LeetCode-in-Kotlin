package g0001_0100.s0010_regular_expression_matching

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat

internal class SolutionTest {
    fun isMatch() {
        assertThat(Solution().isMatch("aa", "a"), equalTo(false))
    }

    fun isMatch2() {
        assertThat(Solution().isMatch("aa", "a*"), equalTo(true))
    }

    fun isMatch3() {
        assertThat(Solution().isMatch("ab", ".*"), equalTo(true))
    }

    fun isMatch4() {
        assertThat(Solution().isMatch("aab", "c*a*b"), equalTo(true))
    }

    fun isMatch5() {
        assertThat(Solution().isMatch("mississippi", "mis*is*p*."), equalTo(false))
    }
}
