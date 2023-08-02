package g0701_0800.s0730_count_different_palindromic_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPalindromicSubsequences() {
        assertThat(Solution().countPalindromicSubsequences("bccb"), equalTo(6))
    }

    @Test
    fun countPalindromicSubsequences2() {
        assertThat(
            Solution()
                .countPalindromicSubsequences(
                    "abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba"
                ),
            equalTo(104860361)
        )
    }
}
