package g3701_3800.s3732_maximum_product_of_three_elements_after_one_replacement

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProduct() {
        assertThat<Long>(
            Solution().maxProduct(intArrayOf(-5, 7, 0)),
            equalTo<Long>(3500000L),
        )
    }

    @Test
    fun maxProduct2() {
        assertThat<Long>(
            Solution().maxProduct(intArrayOf(-4, -2, -1, -3)),
            equalTo<Long>(1200000L),
        )
    }

    @Test
    fun maxProduct3() {
        assertThat<Long>(Solution().maxProduct(intArrayOf(0, 10, 0)), equalTo<Long>(0L))
    }
}
