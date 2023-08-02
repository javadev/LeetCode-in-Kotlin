package g1901_2000.s1969_minimum_non_zero_product_of_the_array_elements

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minNonZeroProduct() {
        assertThat(Solution().minNonZeroProduct(2), equalTo(6))
    }

    @Test
    fun minNonZeroProduct2() {
        assertThat(Solution().minNonZeroProduct(3), equalTo(1512))
    }
}
