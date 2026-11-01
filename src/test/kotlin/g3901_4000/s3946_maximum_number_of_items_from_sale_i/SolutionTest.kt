package g3901_4000.s3946_maximum_number_of_items_from_sale_i

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumSaleItems() {
        assertThat<Int>(
            Solution().maximumSaleItems(arrayOf<IntArray>(intArrayOf(6, 2), intArrayOf(2, 6), intArrayOf(3, 4)), 9),
            equalTo<Int>(4),
        )
    }

    @Test
    fun maximumSaleItems2() {
        assertThat<Int>(
            Solution()
                .maximumSaleItems(
                    arrayOf<IntArray>(
                        intArrayOf(2, 4),
                        intArrayOf(3, 2),
                        intArrayOf(4, 1),
                        intArrayOf(6, 4),
                        intArrayOf(12, 4),
                    ),
                    8,
                ),
            equalTo<Int>(10),
        )
    }

    @Test
    fun maximumSaleItems3() {
        assertThat<Int>(
            Solution().maximumSaleItems(arrayOf<IntArray>(intArrayOf(1, 1)), 1),
            equalTo<Int>(1),
        )
    }
}
