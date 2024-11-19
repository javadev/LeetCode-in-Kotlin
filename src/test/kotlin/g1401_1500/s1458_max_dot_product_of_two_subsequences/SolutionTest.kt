package g1401_1500.s1458_max_dot_product_of_two_subsequences

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDotProduct() {
        assertThat(
            Solution().maxDotProduct(intArrayOf(2, 1, -2, 5), intArrayOf(3, 0, -6)),
            equalTo(18),
        )
    }

    @Test
    fun maxDotProduct2() {
        assertThat(
            Solution().maxDotProduct(intArrayOf(3, -2), intArrayOf(2, -6, 7)),
            equalTo(21),
        )
    }

    @Test
    fun maxDotProduct3() {
        assertThat(
            Solution().maxDotProduct(intArrayOf(-1, -1), intArrayOf(1, 1)),
            equalTo(-1),
        )
    }
}
