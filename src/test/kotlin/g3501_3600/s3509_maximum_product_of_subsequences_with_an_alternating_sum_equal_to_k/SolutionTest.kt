package g3501_3600.s3509_maximum_product_of_subsequences_with_an_alternating_sum_equal_to_k

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProduct() {
        assertThat<Int>(Solution().maxProduct(intArrayOf(1, 2, 3), 2, 10), equalTo<Int>(6))
    }

    @Test
    fun maxProduct2() {
        assertThat<Int>(
            Solution().maxProduct(intArrayOf(0, 2, 3), -5, 12),
            equalTo<Int>(-1),
        )
    }

    @Test
    fun maxProduct3() {
        assertThat<Int>(
            Solution().maxProduct(intArrayOf(2, 2, 3, 3), 0, 9),
            equalTo<Int>(9),
        )
    }

    @Test
    fun maxProduct4() {
        assertThat(Solution().maxProduct(intArrayOf(12, 0, 9), 21, 20), equalTo(0))
    }
}
