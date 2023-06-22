package g2001_2100.s2014_longest_subsequence_repeated_k_times

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestSubsequenceRepeatedK() {
        MatcherAssert.assertThat(Solution().longestSubsequenceRepeatedK("letsleetcode", 2), CoreMatchers.equalTo("let"))
    }

    @Test
    fun longestSubsequenceRepeatedK2() {
        MatcherAssert.assertThat(Solution().longestSubsequenceRepeatedK("bb", 2), CoreMatchers.equalTo("b"))
    }

    @Test
    fun longestSubsequenceRepeatedK3() {
        MatcherAssert.assertThat(Solution().longestSubsequenceRepeatedK("ab", 2), CoreMatchers.equalTo(""))
    }
}
