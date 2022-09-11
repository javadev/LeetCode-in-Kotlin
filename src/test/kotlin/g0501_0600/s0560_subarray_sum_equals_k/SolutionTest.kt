package g0501_0600.s0560_subarray_sum_equals_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subarraySum() {
        assertThat(Solution().subarraySum(intArrayOf(1, 1, 1), 2), equalTo(2))
    }

    @Test
    fun subarraySum2() {
        assertThat(Solution().subarraySum(intArrayOf(1, 2, 3), 3), equalTo(2))
    }
}
