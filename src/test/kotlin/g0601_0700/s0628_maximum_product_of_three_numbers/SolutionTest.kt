package g0601_0700.s0628_maximum_product_of_three_numbers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumProduct() {
        assertThat(Solution().maximumProduct(intArrayOf(1, 2, 3)), equalTo(6))
    }

    @Test
    fun maximumProduct2() {
        assertThat(Solution().maximumProduct(intArrayOf(1, 2, 3, 4)), equalTo(24))
    }

    @Test
    fun maximumProduct3() {
        assertThat(Solution().maximumProduct(intArrayOf(-1, -2, -3)), equalTo(-6))
    }
}
