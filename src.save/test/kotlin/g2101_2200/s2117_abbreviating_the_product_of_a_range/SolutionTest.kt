package g2101_2200.s2117_abbreviating_the_product_of_a_range

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun abbreviateProduct() {
        assertThat(Solution().abbreviateProduct(1, 4), equalTo("24e0"))
    }

    @Test
    fun abbreviateProduct2() {
        assertThat(Solution().abbreviateProduct(2, 11), equalTo("399168e2"))
    }

    @Test
    fun abbreviateProduct3() {
        assertThat(Solution().abbreviateProduct(371, 375), equalTo("7219856259e3"))
    }

    @Test
    fun abbreviateProduct4() {
        assertThat(
            Solution().abbreviateProduct(10000, 100005),
            equalTo("99240...51744e22505")
        )
    }
}
