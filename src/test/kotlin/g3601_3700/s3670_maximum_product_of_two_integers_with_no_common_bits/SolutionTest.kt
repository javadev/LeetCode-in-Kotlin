package g3601_3700.s3670_maximum_product_of_two_integers_with_no_common_bits

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProduct() {
        assertThat<Long>(
            Solution().maxProduct(intArrayOf(1, 2, 3, 4, 5, 6, 7)),
            equalTo<Long>(12L),
        )
    }

    @Test
    fun maxProduct2() {
        assertThat<Long>(Solution().maxProduct(intArrayOf(4, 5, 6)), equalTo<Long>(0L))
    }

    @Test
    fun maxProduct3() {
        assertThat<Long>(
            Solution().maxProduct(intArrayOf(64, 8, 32)),
            equalTo<Long>(2048L),
        )
    }
}
