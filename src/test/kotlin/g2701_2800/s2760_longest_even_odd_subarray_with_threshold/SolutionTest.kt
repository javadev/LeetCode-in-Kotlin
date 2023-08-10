package g2701_2800.s2760_longest_even_odd_subarray_with_threshold

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun longestAlternatingSubarray() {
        assertThat(Solution().longestAlternatingSubarray(intArrayOf(3, 2, 5, 4), 5), equalTo(3))
    }

    @Test
    fun longestAlternatingSubarray2() {
        assertThat(Solution().longestAlternatingSubarray(intArrayOf(1, 2), 2), equalTo(1))
    }

    @Test
    fun longestAlternatingSubarray3() {
        assertThat(Solution().longestAlternatingSubarray(intArrayOf(2, 3, 4, 5), 4), equalTo(3))
    }
}
