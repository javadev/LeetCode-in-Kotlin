package g0601_0700.s0686_repeated_string_match

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun repeatedStringMatch() {
        assertThat(Solution().repeatedStringMatch("abcd", "cdabcdab"), equalTo(3))
    }

    @Test
    fun repeatedStringMatch2() {
        assertThat(Solution().repeatedStringMatch("a", "aa"), equalTo(2))
    }
}
