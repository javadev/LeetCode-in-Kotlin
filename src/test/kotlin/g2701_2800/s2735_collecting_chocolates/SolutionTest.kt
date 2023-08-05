package g2701_2800.s2735_collecting_chocolates

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minCost() {
        assertThat(Solution().minCost(intArrayOf(20, 1, 15), 5), equalTo(13))
    }

    @Test
    fun minCost2() {
        assertThat(Solution().minCost(intArrayOf(1, 2, 3), 4), equalTo(6))
    }
}
