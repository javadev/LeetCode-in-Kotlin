package g3601_3700.s3652_best_time_to_buy_and_sell_stock_using_strategy

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProfit() {
        assertThat<Long>(
            Solution().maxProfit(intArrayOf(4, 2, 8), intArrayOf(-1, 0, 1), 2),
            equalTo<Long>(10L),
        )
    }

    @Test
    fun maxProfit2() {
        assertThat<Long>(
            Solution().maxProfit(intArrayOf(5, 4, 3), intArrayOf(1, 1, 0), 2),
            equalTo<Long>(9L),
        )
    }
}
