package g1701_1800.s1726_tuple_with_same_product

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun tupleSameProduct() {
        assertThat(Solution().tupleSameProduct(intArrayOf(2, 3, 4, 6)), equalTo(8))
    }

    @Test
    fun tupleSameProduct2() {
        assertThat(Solution().tupleSameProduct(intArrayOf(1, 2, 4, 5, 10)), equalTo(16))
    }
}
