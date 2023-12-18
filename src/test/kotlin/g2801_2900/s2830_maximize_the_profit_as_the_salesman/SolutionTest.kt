package g2801_2900.s2830_maximize_the_profit_as_the_salesman

import com_github_leetcode.ArrayUtils.getLists
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maximizeTheProfit() {
        val input = arrayOf(intArrayOf(0, 0, 1), intArrayOf(0, 2, 2), intArrayOf(1, 3, 2))
        assertThat(Solution().maximizeTheProfit(5, getLists(input)), equalTo(3))
    }

    @Test
    fun maximizeTheProfit2() {
        val input = arrayOf(intArrayOf(0, 0, 1), intArrayOf(0, 2, 10), intArrayOf(1, 3, 2))
        assertThat(Solution().maximizeTheProfit(5, getLists(input)), equalTo(10))
    }
}
