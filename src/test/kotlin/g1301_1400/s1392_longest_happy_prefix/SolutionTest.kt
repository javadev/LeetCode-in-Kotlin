package g1301_1400.s1392_longest_happy_prefix

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestPrefix() {
        assertThat(Solution().longestPrefix("level"), equalTo("l"))
    }

    @Test
    fun longestPrefix2() {
        assertThat(Solution().longestPrefix("ababab"), equalTo("abab"))
    }

    @Test
    fun longestPrefix3() {
        assertThat(Solution().longestPrefix("babbb"), equalTo("b"))
    }
}
