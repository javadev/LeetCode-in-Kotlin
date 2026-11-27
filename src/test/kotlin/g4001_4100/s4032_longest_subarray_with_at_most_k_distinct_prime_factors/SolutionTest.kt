package g4001_4100.s4032_longest_subarray_with_at_most_k_distinct_prime_factors

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestSubarray() {
        assertThat<Int>(
            Solution().longestSubarray(intArrayOf(2, 3, 4, 5), 1),
            equalTo<Int>(1),
        )
    }

    @Test
    fun longestSubarray2() {
        assertThat<Int>(
            Solution().longestSubarray(intArrayOf(2, 4, 8), 1),
            equalTo<Int>(3),
        )
    }

    @Test
    fun longestSubarray3() {
        assertThat<Int>(Solution().longestSubarray(intArrayOf(2, 3), 0), equalTo<Int>(0))
    }

    @Test
    fun longestSubarray4() {
        assertThat<Int>(
            Solution().longestSubarray(intArrayOf(1, 1, 2), 0),
            equalTo<Int>(2),
        )
    }
}
