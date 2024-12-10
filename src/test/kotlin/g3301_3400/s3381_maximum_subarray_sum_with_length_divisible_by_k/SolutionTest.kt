package g3301_3400.s3381_maximum_subarray_sum_with_length_divisible_by_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSubarraySum() {
        assertThat<Long>(Solution().maxSubarraySum(intArrayOf(1, 2), 1), equalTo<Long>(3L))
    }

    @Test
    fun maxSubarraySum2() {
        assertThat<Long>(
            Solution().maxSubarraySum(intArrayOf(-1, -2, -3, -4, -5), 4),
            equalTo<Long>(-10L),
        )
    }

    @Test
    fun maxSubarraySum3() {
        assertThat<Long>(
            Solution().maxSubarraySum(intArrayOf(-5, 1, 2, -3, 4), 2),
            equalTo<Long>(4L),
        )
    }
}
