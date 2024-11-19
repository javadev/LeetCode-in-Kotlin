package g1401_1500.s1438_longest_continuous_subarray_with_absolute_diff_less_than_or_equal_to_limit

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestSubarray() {
        assertThat(Solution().longestSubarray(intArrayOf(8, 2, 4, 7), 4), equalTo(2))
    }

    @Test
    fun longestSubarray2() {
        assertThat(Solution().longestSubarray(intArrayOf(10, 1, 2, 4, 7, 2), 5), equalTo(4))
    }

    @Test
    fun longestSubarray3() {
        assertThat(
            Solution().longestSubarray(intArrayOf(4, 2, 2, 2, 4, 4, 2, 2), 0),
            equalTo(3),
        )
    }
}
