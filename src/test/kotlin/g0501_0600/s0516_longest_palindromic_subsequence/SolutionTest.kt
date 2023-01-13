package g0501_0600.s0516_longest_palindromic_subsequence

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestPalindromeSubseq() {
        assertThat(Solution().longestPalindromeSubseq("bbbab"), equalTo(4))
    }

    @Test
    fun longestPalindromeSubseq2() {
        assertThat(Solution().longestPalindromeSubseq("cbbd"), equalTo(2))
    }
}
