package g0301_0400.s0309_best_time_to_buy_and_sell_stock_with_cooldown

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProfit() {
        assertThat(Solution().maxProfit(intArrayOf(1, 2, 3, 0, 2)), equalTo(3))
    }

    @Test
    fun maxProfit2() {
        assertThat(Solution().maxProfit(intArrayOf(1)), equalTo(0))
    }
}
