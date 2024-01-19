package g2901_3000.s2967_minimum_cost_to_make_array_equalindromic

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minimumCost() {
        assertThat(Solution().minimumCost(intArrayOf(1, 2, 3, 4, 5)), equalTo(6L))
    }

    @Test
    fun minimumCost2() {
        assertThat(Solution().minimumCost(intArrayOf(10, 12, 13, 14, 15)), equalTo(11L))
    }

    @Test
    fun minimumCost3() {
        assertThat(Solution().minimumCost(intArrayOf(22, 33, 22, 33, 22)), equalTo(22L))
    }
}
