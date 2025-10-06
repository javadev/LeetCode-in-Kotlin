package g3701_3800.s3702_longest_subsequence_with_non_zero_bitwise_xor

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestSubsequence() {
        assertThat<Int>(
            Solution().longestSubsequence(intArrayOf(1, 2, 3)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun longestSubsequence2() {
        assertThat<Int>(
            Solution().longestSubsequence(intArrayOf(2, 3, 4)),
            equalTo<Int>(3),
        )
    }
}
