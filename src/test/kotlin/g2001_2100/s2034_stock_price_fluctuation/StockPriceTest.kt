package g2001_2100.s2034_stock_price_fluctuation

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class StockPriceTest {
    @Test
    fun stockPriceTest() {
        val stockPrice = StockPrice()
        stockPrice.update(1, 10)
        stockPrice.update(2, 5)
        MatcherAssert.assertThat(stockPrice.current(), CoreMatchers.equalTo(5))
        MatcherAssert.assertThat(stockPrice.maximum(), CoreMatchers.equalTo(10))
        stockPrice.update(1, 3)
        MatcherAssert.assertThat(stockPrice.maximum(), CoreMatchers.equalTo(5))
        stockPrice.update(4, 2)
        MatcherAssert.assertThat(stockPrice.minimum(), CoreMatchers.equalTo(2))
    }
}
