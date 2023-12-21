package g2801_2900.s2806_account_balance_after_rounded_purchase

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun accountBalanceAfterPurchase() {
        assertThat(Solution().accountBalanceAfterPurchase(9), equalTo(90))
    }

    @Test
    fun accountBalanceAfterPurchase2() {
        assertThat(Solution().accountBalanceAfterPurchase(15), equalTo(80))
    }
}
