package g0101_0200.s0188_best_time_to_buy_and_sell_stock_iv

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProfit() {
        assertThat(Solution().maxProfit(2, intArrayOf(2, 4, 1)), equalTo(2))
    }

    @Test
    fun maxProfit2() {
        assertThat(Solution().maxProfit(2, intArrayOf(3, 2, 6, 5, 0, 3)), equalTo(7))
    }
}
