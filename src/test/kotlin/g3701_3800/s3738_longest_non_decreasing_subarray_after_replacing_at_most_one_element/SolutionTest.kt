package g3701_3800.s3738_longest_non_decreasing_subarray_after_replacing_at_most_one_element

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestSubarray() {
        assertThat<Int>(Solution().longestSubarray(intArrayOf(1, 2, 3)), equalTo<Int>(3))
    }

    @Test
    fun longestSubarray2() {
        assertThat<Int>(Solution().longestSubarray(intArrayOf(3, 2, 1)), equalTo<Int>(2))
    }

    @Test
    fun longestSubarray3() {
        assertThat<Int>(
            Solution().longestSubarray(intArrayOf(1, 5, 3, 4, 6)),
            equalTo<Int>(5),
        )
    }

    @Test
    fun longestSubarray4() {
        assertThat<Int>(Solution().longestSubarray(intArrayOf(1, 5)), equalTo<Int>(2))
    }
}
