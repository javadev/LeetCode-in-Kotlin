package g3401_3500.s3409_longest_subsequence_with_decreasing_adjacent_difference

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestSubsequence() {
        assertThat<Int>(
            Solution().longestSubsequence(intArrayOf(16, 6, 3)),
            equalTo<Int>(3),
        )
    }

    @Test
    fun longestSubsequence2() {
        assertThat<Int>(
            Solution().longestSubsequence(intArrayOf(6, 5, 3, 4, 2, 1)),
            equalTo<Int>(4),
        )
    }

    @Test
    fun longestSubsequence3() {
        assertThat<Int>(
            Solution().longestSubsequence(intArrayOf(10, 20, 10, 19, 10, 20)),
            equalTo<Int>(5),
        )
    }
}
