package g0101_0200.s0152_maximum_product_subarray

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProduct() {
        assertThat(Solution().maxProduct(intArrayOf(2, 3, -2, 4)), equalTo(6))
    }

    @Test
    fun maxProduct2() {
        assertThat(Solution().maxProduct(intArrayOf(-2, 0, -1)), equalTo(0))
    }
}
