package g0901_1000.s0918_maximum_sum_circular_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSubarraySumCircular() {
        assertThat(Solution().maxSubarraySumCircular(intArrayOf(1, -2, 3, -2)), equalTo(3))
    }

    @Test
    fun maxSubarraySumCircular2() {
        assertThat(Solution().maxSubarraySumCircular(intArrayOf(5, -3, 5)), equalTo(10))
    }

    @Test
    fun maxSubarraySumCircular3() {
        assertThat(Solution().maxSubarraySumCircular(intArrayOf(-3, -2, -3)), equalTo(-2))
    }
}
