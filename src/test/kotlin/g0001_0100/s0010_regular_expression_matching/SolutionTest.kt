package g0001_0100.s0010_regular_expression_matching

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isMatch() {
        assertThat(Solution().isMatch("aa", "a"), equalTo(false))
    }

    @Test
    fun isMatch2() {
        assertThat(Solution().isMatch("aa", "a*"), equalTo(true))
    }

    @Test
    fun isMatch3() {
        assertThat(Solution().isMatch("ab", ".*"), equalTo(true))
    }

    @Test
    fun isMatch4() {
        assertThat(Solution().isMatch("aab", "c*a*b"), equalTo(true))
    }

    @Test
    fun isMatch5() {
        assertThat(Solution().isMatch("mississippi", "mis*is*p*."), equalTo(false))
    }
}
