package g3801_3900.s3825_longest_strictly_increasing_subsequence_with_non_zero_bitwise_and

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestSubsequence() {
        assertThat<Int>(
            Solution().longestSubsequence(intArrayOf(5, 4, 7)),
            equalTo<Int>(2),
        )
    }

    @Test
    fun longestSubsequence2() {
        assertThat<Int>(
            Solution().longestSubsequence(intArrayOf(2, 3, 6)),
            equalTo<Int>(3),
        )
    }

    @Test
    fun longestSubsequence3() {
        assertThat<Int>(Solution().longestSubsequence(intArrayOf(0, 1)), equalTo<Int>(1))
    }
}
