package g3401_3500.s3410_maximize_subarray_sum_after_removing_all_occurrences_of_one_element

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSubarraySum() {
        assertThat<Long>(
            Solution().maxSubarraySum(intArrayOf(-3, 2, -2, -1, 3, -2, 3)),
            equalTo<Long>(7L),
        )
    }

    @Test
    fun maxSubarraySum2() {
        assertThat<Long>(
            Solution().maxSubarraySum(intArrayOf(1, 2, 3, 4)),
            equalTo<Long>(10L),
        )
    }
}
