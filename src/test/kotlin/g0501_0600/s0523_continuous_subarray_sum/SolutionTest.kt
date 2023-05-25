package g0501_0600.s0523_continuous_subarray_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun checkSubarraySum() {
        assertThat(Solution().checkSubarraySum(intArrayOf(23, 2, 4, 6, 7), 6), equalTo(true))
    }

    @Test
    fun checkSubarraySum2() {
        assertThat(Solution().checkSubarraySum(intArrayOf(23, 2, 6, 4, 7), 6), equalTo(true))
    }

    @Test
    fun checkSubarraySum3() {
        assertThat(Solution().checkSubarraySum(intArrayOf(23, 2, 6, 4, 7), 13), equalTo(false))
    }
}
