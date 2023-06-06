package g1301_1400.s1357_apply_discount_every_n_orders

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class CashierTest {
    @Test
    fun cashierTest() {
        val cashier = Cashier(
            3,
            50, intArrayOf(1, 2, 3, 4, 5, 6, 7), intArrayOf(100, 200, 300, 400, 300, 200, 100)
        )
        assertThat(cashier.getBill(intArrayOf(1, 2), intArrayOf(1, 2)), equalTo(500.0))
        assertThat(cashier.getBill(intArrayOf(3, 7), intArrayOf(10, 10)), equalTo(4000.0))
        assertThat(
            cashier.getBill(intArrayOf(1, 2, 3, 4, 5, 6, 7), intArrayOf(1, 1, 1, 1, 1, 1, 1)),
            equalTo(800.0)
        )
        assertThat(cashier.getBill(intArrayOf(4), intArrayOf(10)), equalTo(4000.0))
        assertThat(cashier.getBill(intArrayOf(7, 3), intArrayOf(10, 10)), equalTo(4000.0))
        assertThat(
            cashier.getBill(intArrayOf(7, 5, 3, 1, 6, 4, 2), intArrayOf(10, 10, 10, 9, 9, 9, 7)),
            equalTo(7350.0)
        )
        cashier.getBill(intArrayOf(2, 3, 5), intArrayOf(5, 3, 2))
    }
}
