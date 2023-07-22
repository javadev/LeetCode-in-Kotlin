package g2401_2500.s2419_longest_subarray_with_maximum_bitwise_and

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestSubarray() {
        assertThat(Solution().longestSubarray(intArrayOf(1, 2, 3, 3, 2, 2)), equalTo(2))
    }

    @Test
    fun longestSubarray2() {
        assertThat(Solution().longestSubarray(intArrayOf(1, 2, 3, 4)), equalTo(1))
    }
}
