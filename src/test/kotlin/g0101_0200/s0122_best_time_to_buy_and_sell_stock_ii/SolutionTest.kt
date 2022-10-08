package g0101_0200.s0122_best_time_to_buy_and_sell_stock_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProfit() {
        assertThat(Solution().maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)), equalTo(7))
    }

    @Test
    fun maxProfit2() {
        assertThat(Solution().maxProfit(intArrayOf(1, 2, 3, 4, 5)), equalTo(4))
    }

    @Test
    fun maxProfit3() {
        assertThat(Solution().maxProfit(intArrayOf(7, 6, 4, 3, 1)), equalTo(0))
    }
}
