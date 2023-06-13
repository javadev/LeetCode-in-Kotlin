package g1401_1500.s1475_final_prices_with_a_special_discount_in_a_shop

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun finalPrices() {
        assertThat(
            Solution().finalPrices(intArrayOf(8, 4, 6, 2, 3)),
            equalTo(intArrayOf(4, 2, 4, 2, 3))
        )
    }

    @Test
    fun finalPrices2() {
        assertThat(
            Solution().finalPrices(intArrayOf(1, 2, 3, 4, 5)),
            equalTo(intArrayOf(1, 2, 3, 4, 5))
        )
    }

    @Test
    fun finalPrices3() {
        assertThat(
            Solution().finalPrices(intArrayOf(10, 1, 1, 6)),
            equalTo(intArrayOf(9, 0, 1, 6))
        )
    }
}
