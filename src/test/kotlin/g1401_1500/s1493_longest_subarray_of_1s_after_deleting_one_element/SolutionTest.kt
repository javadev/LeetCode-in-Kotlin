package g1401_1500.s1493_longest_subarray_of_1s_after_deleting_one_element

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestSubarray() {
        assertThat(Solution().longestSubarray(intArrayOf(1, 1, 0, 1)), equalTo(3))
    }

    @Test
    fun longestSubarray2() {
        assertThat(
            Solution().longestSubarray(intArrayOf(0, 1, 1, 1, 0, 1, 1, 0, 1)), equalTo(5)
        )
    }

    @Test
    fun longestSubarray3() {
        assertThat(Solution().longestSubarray(intArrayOf(1, 1, 1)), equalTo(2))
    }
}
