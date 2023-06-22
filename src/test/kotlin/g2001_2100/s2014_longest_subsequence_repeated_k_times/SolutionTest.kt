package g2001_2100.s2014_longest_subsequence_repeated_k_times

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestSubsequenceRepeatedK() {
        assertThat(Solution().longestSubsequenceRepeatedK("letsleetcode", 2), equalTo("let"))
    }

    @Test
    fun longestSubsequenceRepeatedK2() {
        assertThat(Solution().longestSubsequenceRepeatedK("bb", 2), equalTo("b"))
    }

    @Test
    fun longestSubsequenceRepeatedK3() {
        assertThat(Solution().longestSubsequenceRepeatedK("ab", 2), equalTo(""))
    }
}
