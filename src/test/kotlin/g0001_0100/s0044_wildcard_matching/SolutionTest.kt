package g0001_0100.s0044_wildcard_matching

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
        assertThat(Solution().isMatch("aa", "*"), equalTo(true))
    }

    @Test
    fun isMatch3() {
        assertThat(Solution().isMatch("cb", "?a"), equalTo(false))
    }

    @Test
    fun isMatch4() {
        assertThat(Solution().isMatch("adceb", "*a*b"), equalTo(true))
    }

    @Test
    fun isMatch5() {
        assertThat(Solution().isMatch("acdcb", "a*c?b"), equalTo(false))
    }
}
