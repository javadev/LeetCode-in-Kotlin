package g1601_1700.s1648_sell_diminishing_valued_colored_balls

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxProfit() {
        MatcherAssert.assertThat(Solution().maxProfit(intArrayOf(2, 5), 4), CoreMatchers.equalTo(14))
    }

    @Test
    fun maxProfit2() {
        MatcherAssert.assertThat(Solution().maxProfit(intArrayOf(3, 5), 6), CoreMatchers.equalTo(19))
    }
}
