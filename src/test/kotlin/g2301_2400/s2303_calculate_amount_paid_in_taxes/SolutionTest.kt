package g2301_2400.s2303_calculate_amount_paid_in_taxes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun calculateTax() {
        assertThat(
            Solution().calculateTax(arrayOf(intArrayOf(3, 50), intArrayOf(7, 10), intArrayOf(12, 25)), 10),
            equalTo(2.65000),
        )
    }

    @Test
    fun calculateTax2() {
        assertThat(
            Solution().calculateTax(arrayOf(intArrayOf(1, 0), intArrayOf(4, 25), intArrayOf(5, 50)), 2),
            equalTo(0.25000),
        )
    }

    @Test
    fun calculateTax3() {
        assertThat(
            Solution().calculateTax(arrayOf(intArrayOf(1, 0), intArrayOf(4, 25), intArrayOf(5, 50)), 0),
            equalTo(0.0),
        )
    }
}
