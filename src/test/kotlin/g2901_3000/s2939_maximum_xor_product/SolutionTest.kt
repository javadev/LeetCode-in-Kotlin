package g2901_3000.s2939_maximum_xor_product

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumXorProduct() {
        assertThat(Solution().maximumXorProduct(12, 5, 4), equalTo(98))
    }

    @Test
    fun maximumXorProduct2() {
        assertThat(Solution().maximumXorProduct(6, 7, 5), equalTo(930))
    }

    @Test
    fun maximumXorProduct3() {
        assertThat(Solution().maximumXorProduct(1, 6, 3), equalTo(12))
    }
}
