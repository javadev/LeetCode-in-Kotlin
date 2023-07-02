package g2301_2400.s2311_longest_binary_subsequence_less_than_or_equal_to_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestSubsequence() {
        assertThat(Solution().longestSubsequence("1001010", 5), equalTo(5))
    }

    @Test
    fun longestSubsequence2() {
        assertThat(Solution().longestSubsequence("00101001", 1), equalTo(6))
    }
}
