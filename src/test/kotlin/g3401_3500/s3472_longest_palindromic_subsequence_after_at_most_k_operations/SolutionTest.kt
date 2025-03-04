package g3401_3500.s3472_longest_palindromic_subsequence_after_at_most_k_operations

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestPalindromicSubsequence() {
        assertThat<Int>(
            Solution().longestPalindromicSubsequence("abced", 2),
            equalTo<Int>(3),
        )
    }

    @Test
    fun longestPalindromicSubsequence2() {
        assertThat<Int>(
            Solution().longestPalindromicSubsequence("aaazzz", 4),
            equalTo<Int>(6),
        )
    }
}
