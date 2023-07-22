package g1101_1200.s1143_longest_common_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestCommonSubsequence() {
        assertThat(Solution().longestCommonSubsequence("abcde", "ace"), equalTo(3))
    }

    @Test
    fun longestCommonSubsequence2() {
        assertThat(Solution().longestCommonSubsequence("abc", "abc"), equalTo(3))
    }

    @Test
    fun longestCommonSubsequence3() {
        assertThat(Solution().longestCommonSubsequence("abc", "def"), equalTo(0))
    }
}
