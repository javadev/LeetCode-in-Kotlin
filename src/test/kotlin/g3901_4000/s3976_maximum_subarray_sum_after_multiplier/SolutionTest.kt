package g3901_4000.s3976_maximum_subarray_sum_after_multiplier

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSubarraySum() {
        assertThat<Long>(
            Solution().maxSubarraySum(intArrayOf(1, -2, 3, 4, -5), 2),
            equalTo<Long>(14L),
        )
    }

    @Test
    fun maxSubarraySum2() {
        assertThat<Long>(
            Solution().maxSubarraySum(intArrayOf(-5, -4, -3), 2),
            equalTo<Long>(-1L),
        )
    }

    @Test
    fun maxSubarraySum3() {
        assertThat<Long>(
            Solution().maxSubarraySum(intArrayOf(1, 2, 3), 2),
            equalTo<Long>(12L),
        )
    }
}
