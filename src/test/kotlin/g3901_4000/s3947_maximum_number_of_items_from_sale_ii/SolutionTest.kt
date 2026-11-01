package g3901_4000.s3947_maximum_number_of_items_from_sale_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSaleItems() {
        assertThat<Int>(
            Solution().maximumSaleItems(arrayOf<IntArray>(intArrayOf(1, 6), intArrayOf(2, 4), intArrayOf(3, 5)), 19),
            equalTo<Int>(5),
        )
    }

    @Test
    fun maximumSaleItems2() {
        assertThat<Int>(
            Solution()
                .maximumSaleItems(
                    arrayOf<IntArray>(
                        intArrayOf(2, 8),
                        intArrayOf(1, 10),
                        intArrayOf(6, 6),
                        intArrayOf(4, 12),
                        intArrayOf(5, 20),
                        intArrayOf(5, 17),
                    ),
                    35,
                ),
            equalTo<Int>(7),
        )
    }

    @Test
    fun maximumSaleItems3() {
        assertThat<Int>(
            Solution().maximumSaleItems(arrayOf<IntArray>(intArrayOf(1, 6), intArrayOf(2, 4), intArrayOf(3, 5)), 6),
            equalTo<Int>(2),
        )
    }
}
