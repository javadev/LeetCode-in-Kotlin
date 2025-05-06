package g3501_3600.s3536_maximum_product_of_two_digits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProduct() {
        assertThat<Int>(Solution().maxProduct(31), equalTo<Int>(3))
    }

    @Test
    fun maxProduct2() {
        assertThat<Int>(Solution().maxProduct(22), equalTo<Int>(4))
    }

    @Test
    fun maxProduct3() {
        assertThat<Int>(Solution().maxProduct(124), equalTo<Int>(8))
    }

    @Test
    fun maxProduct4() {
        assertThat<Int>(Solution().maxProduct(453), equalTo<Int>(20))
    }

    @Test
    fun maxProduct5() {
        assertThat<Int>(Solution().maxProduct(437), equalTo<Int>(28))
    }

    @Test
    fun maxProduct6() {
        assertThat<Int>(Solution().maxProduct(724), equalTo<Int>(28))
    }
}
