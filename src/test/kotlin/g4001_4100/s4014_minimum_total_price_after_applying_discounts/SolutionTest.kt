package g4001_4100.s4014_minimum_total_price_after_applying_discounts

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minPrice() {
        assertThat<Double>(
            Solution().minPrice(intArrayOf(10, 30, 21), intArrayOf(50, 60)),
            equalTo<Double>(32.5),
        )
    }

    @Test
    fun minPrice2() {
        assertThat<Double>(
            Solution().minPrice(intArrayOf(100, 70), intArrayOf(10, 40, 50)),
            equalTo<Double>(92.0),
        )
    }

    @Test
    fun minPrice3() {
        assertThat<Double>(
            Solution().minPrice(intArrayOf(7, 3, 9), intArrayOf(100, 100)),
            equalTo<Double>(3.0),
        )
    }
}
