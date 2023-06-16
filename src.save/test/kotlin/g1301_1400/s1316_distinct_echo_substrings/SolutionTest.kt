package g1301_1400.s1316_distinct_echo_substrings

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun distinctEchoSubstrings() {
        assertThat(Solution().distinctEchoSubstrings("abcabcabc"), equalTo(3))
    }

    @Test
    fun distinctEchoSubstrings2() {
        assertThat(Solution().distinctEchoSubstrings("leetcodeleetcode"), equalTo(2))
    }
}
