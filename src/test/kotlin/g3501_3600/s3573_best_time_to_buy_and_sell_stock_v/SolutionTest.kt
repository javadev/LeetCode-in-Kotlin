package g3501_3600.s3573_best_time_to_buy_and_sell_stock_v

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximumProfit() {
        assertThat<Long>(
            Solution().maximumProfit(intArrayOf(1, 7, 9, 8, 2), 2),
            equalTo<Long>(14L),
        )
    }

    @Test
    fun maximumProfit2() {
        assertThat<Long>(
            Solution().maximumProfit(intArrayOf(12, 16, 19, 19, 8, 1, 19, 13, 9), 3),
            equalTo<Long>(36L),
        )
    }
}
