package g1801_1900.s1856_maximum_subarray_min_product

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxSumMinProduct() {
        assertThat(Solution().maxSumMinProduct(intArrayOf(1, 2, 3, 2)), equalTo(14))
    }

    @Test
    fun maxSumMinProduct2() {
        assertThat(Solution().maxSumMinProduct(intArrayOf(2, 3, 3, 1, 2)), equalTo(18))
    }

    @Test
    fun maxSumMinProduct3() {
        assertThat(Solution().maxSumMinProduct(intArrayOf(3, 1, 5, 6, 4, 2)), equalTo(60))
    }
}
