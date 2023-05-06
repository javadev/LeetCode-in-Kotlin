package g0901_1000.s0974_subarray_sums_divisible_by_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun subarraysDivByK() {
        assertThat(Solution().subarraysDivByK(intArrayOf(4, 5, 0, -2, -3, 1), 5), equalTo(7))
    }

    @Test
    fun subarraysDivByK2() {
        assertThat(Solution().subarraysDivByK(intArrayOf(5), 9), equalTo(0))
    }
}
