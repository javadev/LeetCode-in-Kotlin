package g2001_2100.s2040_kth_smallest_product_of_two_sorted_arrays

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthSmallestProduct() {
        assertThat(
            Solution().kthSmallestProduct(intArrayOf(2, 5), intArrayOf(3, 4), 2),
            equalTo(8L)
        )
    }

    @Test
    fun kthSmallestProduct2() {
        assertThat(
            Solution().kthSmallestProduct(intArrayOf(-4, -2, 0, 3), intArrayOf(2, 4), 6),
            equalTo(0L)
        )
    }

    @Test
    fun kthSmallestProduct3() {
        assertThat(
            Solution()
                .kthSmallestProduct(intArrayOf(-2, -1, 0, 1, 2), intArrayOf(-3, -1, 2, 4, 5), 3),
            equalTo(-6L)
        )
    }
}
