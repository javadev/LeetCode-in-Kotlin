package g2201_2300.s2233_maximum_product_after_k_increments

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumProduct() {
        assertThat(Solution().maximumProduct(intArrayOf(0, 4), 5), equalTo(20))
    }

    @Test
    fun maximumProduct2() {
        assertThat(Solution().maximumProduct(intArrayOf(6, 3, 3, 2), 2), equalTo(216))
    }
}
