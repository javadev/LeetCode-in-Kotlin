package g2101_2200.s2144_minimum_cost_of_buying_candies_with_discount

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumCost() {
        assertThat(Solution().minimumCost(intArrayOf(1, 2, 3)), equalTo(5))
    }

    @Test
    fun minimumCost2() {
        assertThat(Solution().minimumCost(intArrayOf(6, 5, 7, 9, 2, 2)), equalTo(23))
    }

    @Test
    fun minimumCost3() {
        assertThat(Solution().minimumCost(intArrayOf(5, 5)), equalTo(10))
    }
}
