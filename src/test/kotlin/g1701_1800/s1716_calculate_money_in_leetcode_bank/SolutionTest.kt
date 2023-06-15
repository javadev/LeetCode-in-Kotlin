package g1701_1800.s1716_calculate_money_in_leetcode_bank

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun totalMoney() {
        assertThat(Solution().totalMoney(4), equalTo(10))
    }

    @Test
    fun totalMoney2() {
        assertThat(Solution().totalMoney(10), equalTo(37))
    }

    @Test
    fun totalMoney3() {
        assertThat(Solution().totalMoney(20), equalTo(96))
    }
}
