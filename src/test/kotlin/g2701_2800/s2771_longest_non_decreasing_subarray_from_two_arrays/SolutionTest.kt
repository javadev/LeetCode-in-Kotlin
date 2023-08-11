package g2701_2800.s2771_longest_non_decreasing_subarray_from_two_arrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxNonDecreasingLength() {
        assertThat(
            Solution().maxNonDecreasingLength(intArrayOf(2, 3, 1), intArrayOf(1, 2, 1)),
            equalTo(2)
        )
    }

    @Test
    fun maxNonDecreasingLength2() {
        assertThat(
            Solution().maxNonDecreasingLength(intArrayOf(1, 3, 2, 1), intArrayOf(2, 2, 3, 4)),
            equalTo(4)
        )
    }
}
