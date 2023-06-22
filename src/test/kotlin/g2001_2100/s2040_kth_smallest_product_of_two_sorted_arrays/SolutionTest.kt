package g2001_2100.s2040_kth_smallest_product_of_two_sorted_arrays

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun kthSmallestProduct() {
        MatcherAssert.assertThat(
            Solution().kthSmallestProduct(intArrayOf(2, 5), intArrayOf(3, 4), 2),
            CoreMatchers.equalTo(8L)
        )
    }

    @Test
    fun kthSmallestProduct2() {
        MatcherAssert.assertThat(
            Solution().kthSmallestProduct(intArrayOf(-4, -2, 0, 3), intArrayOf(2, 4), 6),
            CoreMatchers.equalTo(0L)
        )
    }

    @Test
    fun kthSmallestProduct3() {
        MatcherAssert.assertThat(
            Solution()
                .kthSmallestProduct(intArrayOf(-2, -1, 0, 1, 2), intArrayOf(-3, -1, 2, 4, 5), 3),
            CoreMatchers.equalTo(-6L)
        )
    }
}
