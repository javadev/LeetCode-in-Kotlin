package g2901_3000.s2958_length_of_longest_subarray_with_at_most_k_frequency

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSubarrayLength() {
        MatcherAssert.assertThat(
            Solution().maxSubarrayLength(intArrayOf(1, 2, 3, 1, 2, 3, 1, 2), 2),
            CoreMatchers.equalTo(6)
        )
    }

    @Test
    fun maxSubarrayLength2() {
        MatcherAssert.assertThat(
            Solution().maxSubarrayLength(intArrayOf(1, 2, 1, 2, 1, 2, 1, 2), 1),
            CoreMatchers.equalTo(2)
        )
    }

    @Test
    fun maxSubarrayLength3() {
        MatcherAssert.assertThat(
            Solution().maxSubarrayLength(intArrayOf(5, 5, 5, 5, 5, 5, 5), 4), CoreMatchers.equalTo(4)
        )
    }
}
