package g2901_3000.s2958_length_of_longest_subarray_with_at_most_k_frequency

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSubarrayLength() {
        assertThat(
            Solution().maxSubarrayLength(intArrayOf(1, 2, 3, 1, 2, 3, 1, 2), 2),
            equalTo(6)
        )
    }

    @Test
    fun maxSubarrayLength2() {
        assertThat(
            Solution().maxSubarrayLength(intArrayOf(1, 2, 1, 2, 1, 2, 1, 2), 1),
            equalTo(2)
        )
    }

    @Test
    fun maxSubarrayLength3() {
        assertThat(
            Solution().maxSubarrayLength(intArrayOf(5, 5, 5, 5, 5, 5, 5), 4), equalTo(4)
        )
    }
}
