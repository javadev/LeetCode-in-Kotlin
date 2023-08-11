package g1401_1500.s1464_maximum_product_of_two_elements_in_an_array

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProduct() {
        assertThat(Solution().maxProduct(intArrayOf(3, 4, 5, 2)), equalTo(12))
    }

    @Test
    fun maxProduct2() {
        assertThat(Solution().maxProduct(intArrayOf(1, 5, 4, 5)), equalTo(16))
    }

    @Test
    fun maxProduct3() {
        assertThat(Solution().maxProduct(intArrayOf(3, 7)), equalTo(12))
    }
}
