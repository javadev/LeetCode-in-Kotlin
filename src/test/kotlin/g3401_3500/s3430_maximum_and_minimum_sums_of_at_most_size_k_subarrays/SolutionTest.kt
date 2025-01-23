package g3401_3500.s3430_maximum_and_minimum_sums_of_at_most_size_k_subarrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minMaxSubarraySum() {
        assertThat<Long>(
            Solution().minMaxSubarraySum(intArrayOf(1, 2, 3), 2),
            equalTo<Long>(20L),
        )
    }

    @Test
    fun minMaxSubarraySum2() {
        assertThat<Long>(
            Solution().minMaxSubarraySum(intArrayOf(1, -3, 1), 2),
            equalTo<Long>(-6L),
        )
    }
}
