package g1501_1600.s1567_maximum_length_of_subarray_with_positive_product

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxLen() {
        assertThat(Solution().getMaxLen(intArrayOf(1, -2, -3, 4)), equalTo(4))
    }

    @Test
    fun maxLen2() {
        assertThat(Solution().getMaxLen(intArrayOf(0, 1, -2, -3, -4)), equalTo(3))
    }

    @Test
    fun maxLen3() {
        assertThat(Solution().getMaxLen(intArrayOf(-1, -2, -3, 0, 1)), equalTo(2))
    }
}
