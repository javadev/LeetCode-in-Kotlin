package g2401_2500.s2412_minimum_money_required_before_transactions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumMoney() {
        assertThat(
            Solution().minimumMoney(arrayOf(intArrayOf(2, 1), intArrayOf(5, 0), intArrayOf(4, 2))),
            equalTo(10L)
        )
    }

    @Test
    fun minimumMoney2() {
        assertThat(
            Solution().minimumMoney(arrayOf(intArrayOf(3, 0), intArrayOf(0, 3))),
            equalTo(3L)
        )
    }
}
