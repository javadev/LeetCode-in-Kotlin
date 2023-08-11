package g0901_1000.s0930_binary_subarrays_with_sum

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSubarraysWithSum() {
        assertThat(Solution().numSubarraysWithSum(intArrayOf(1, 0, 1, 0, 1), 2), equalTo(4))
    }

    @Test
    fun numSubarraysWithSum2() {
        assertThat(Solution().numSubarraysWithSum(intArrayOf(0, 0, 0, 0, 0), 0), equalTo(15))
    }
}
