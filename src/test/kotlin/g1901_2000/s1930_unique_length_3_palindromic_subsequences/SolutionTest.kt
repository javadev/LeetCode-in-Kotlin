package g1901_2000.s1930_unique_length_3_palindromic_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun countPalindromicSubsequence() {
        assertThat(Solution().countPalindromicSubsequence("aabca"), equalTo(3))
    }

    @Test
    fun countPalindromicSubsequence2() {
        assertThat(Solution().countPalindromicSubsequence("abc"), equalTo(0))
    }

    @Test
    fun countPalindromicSubsequence3() {
        assertThat(Solution().countPalindromicSubsequence("bbcbaba"), equalTo(4))
    }
}
