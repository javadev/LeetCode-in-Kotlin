package g2001_2100.s2034_stock_price_fluctuation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class StockPriceTest {
    @Test
    fun stockPriceTest() {
        val stockPrice = StockPrice()
        stockPrice.update(1, 10)
        stockPrice.update(2, 5)
        assertThat(stockPrice.current(), equalTo(5))
        assertThat(stockPrice.maximum(), equalTo(10))
        stockPrice.update(1, 3)
        assertThat(stockPrice.maximum(), equalTo(5))
        stockPrice.update(4, 2)
        assertThat(stockPrice.minimum(), equalTo(2))
    }
}
