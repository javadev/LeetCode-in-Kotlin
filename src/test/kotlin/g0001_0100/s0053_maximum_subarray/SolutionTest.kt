package g0001_0100.s0053_maximum_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSubArray() {
        assertThat(Solution().maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)), equalTo(6))
    }

    @Test
    fun maxSubArray2() {
        assertThat(Solution().maxSubArray(intArrayOf(1)), equalTo(1))
    }

    @Test
    fun maxSubArray3() {
        assertThat(Solution().maxSubArray(intArrayOf(5, 4, -1, 7, 8)), equalTo(23))
    }
}
