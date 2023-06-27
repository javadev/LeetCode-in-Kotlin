package g1201_1300.s1218_longest_arithmetic_subsequence_of_given_difference

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestSubsequence() {
        assertThat(Solution().longestSubsequence(intArrayOf(1, 2, 3, 4), 1), equalTo(4))
    }

    @Test
    fun longestSubsequence2() {
        assertThat(Solution().longestSubsequence(intArrayOf(1, 3, 5, 7), 1), equalTo(1))
    }

    @Test
    fun longestSubsequence3() {
        assertThat(
            Solution().longestSubsequence(intArrayOf(1, 5, 7, 8, 5, 3, 4, 2, 1), -2),
            equalTo(4)
        )
    }
}
