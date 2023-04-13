package g0901_1000.s0901_online_stock_span

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class StockSpannerTest {
    @Test
    fun stockSpannerTest() {
        val stockSpanner = StockSpanner()
        assertThat(stockSpanner.next(100), equalTo(1))
        assertThat(stockSpanner.next(80), equalTo(1))
        assertThat(stockSpanner.next(60), equalTo(1))
        assertThat(stockSpanner.next(70), equalTo(2))
        assertThat(stockSpanner.next(60), equalTo(1))
        assertThat(stockSpanner.next(75), equalTo(4))
        assertThat(stockSpanner.next(85), equalTo(6))
    }
}
