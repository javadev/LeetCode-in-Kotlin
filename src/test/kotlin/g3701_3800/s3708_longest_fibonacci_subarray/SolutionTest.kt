package g3701_3800.s3708_longest_fibonacci_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestSubarray() {
        assertThat<Int>(
            Solution().longestSubarray(intArrayOf(1, 1, 1, 1, 2, 3, 5, 1)),
            equalTo<Int>(5),
        )
    }

    @Test
    fun longestSubarray2() {
        assertThat<Int>(
            Solution().longestSubarray(intArrayOf(5, 2, 7, 9, 16)),
            equalTo<Int>(5),
        )
    }

    @Test
    fun longestSubarray3() {
        assertThat<Int>(
            Solution().longestSubarray(intArrayOf(1000000000, 1000000000, 1000000000)),
            equalTo<Int>(2),
        )
    }
}
