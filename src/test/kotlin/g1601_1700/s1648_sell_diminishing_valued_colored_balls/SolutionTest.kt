package g1601_1700.s1648_sell_diminishing_valued_colored_balls

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProfit() {
        assertThat(Solution().maxProfit(intArrayOf(2, 5), 4), equalTo(14))
    }

    @Test
    fun maxProfit2() {
        assertThat(Solution().maxProfit(intArrayOf(3, 5), 6), equalTo(19))
    }
}
