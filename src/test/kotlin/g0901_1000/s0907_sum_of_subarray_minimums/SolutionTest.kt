package g0901_1000.s0907_sum_of_subarray_minimums

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumSubarrayMins() {
        assertThat(Solution().sumSubarrayMins(intArrayOf(3, 1, 2, 4)), equalTo(17))
    }

    @Test
    fun sumSubarrayMins2() {
        assertThat(Solution().sumSubarrayMins(intArrayOf(11, 81, 94, 43, 3)), equalTo(444))
    }
}
