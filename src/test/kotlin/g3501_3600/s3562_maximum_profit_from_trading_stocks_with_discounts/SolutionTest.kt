package g3501_3600.s3562_maximum_profit_from_trading_stocks_with_discounts

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProfit() {
        assertThat<Int>(
            Solution()
                .maxProfit(2, intArrayOf(1, 2), intArrayOf(4, 3), arrayOf<IntArray>(intArrayOf(1, 2)), 3),
            equalTo<Int>(5),
        )
    }

    @Test
    fun maxProfit2() {
        assertThat<Int>(
            Solution()
                .maxProfit(2, intArrayOf(3, 4), intArrayOf(5, 8), arrayOf<IntArray>(intArrayOf(1, 2)), 4),
            equalTo<Int>(4),
        )
    }

    @Test
    fun maxProfit3() {
        assertThat<Int>(
            Solution()
                .maxProfit(
                    3,
                    intArrayOf(4, 6, 8),
                    intArrayOf(7, 9, 11),
                    arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(1, 3)),
                    10,
                ),
            equalTo<Int>(10),
        )
    }

    @Test
    fun maxProfit4() {
        assertThat<Int>(
            Solution()
                .maxProfit(
                    3,
                    intArrayOf(5, 2, 3),
                    intArrayOf(8, 5, 6),
                    arrayOf<IntArray>(intArrayOf(1, 2), intArrayOf(1, 3)),
                    7,
                ),
            equalTo<Int>(12),
        )
    }
}
