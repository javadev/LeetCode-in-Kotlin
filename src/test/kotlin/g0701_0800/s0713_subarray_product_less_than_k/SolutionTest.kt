package g0701_0800.s0713_subarray_product_less_than_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numSubarrayProductLessThanK() {
        assertThat(
            Solution().numSubarrayProductLessThanK(intArrayOf(10, 5, 2, 6), 100),
            equalTo(8),
        )
    }

    @Test
    fun numSubarrayProductLessThanK2() {
        assertThat(Solution().numSubarrayProductLessThanK(intArrayOf(1, 2, 3), 0), equalTo(0))
    }
}
