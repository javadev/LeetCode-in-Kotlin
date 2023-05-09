package g0901_1000.s0983_minimum_cost_for_tickets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun mincostTickets() {
        assertThat(
            Solution().mincostTickets(intArrayOf(1, 4, 6, 7, 8, 20), intArrayOf(2, 7, 15)),
            equalTo(11)
        )
    }

    @Test
    fun mincostTickets2() {
        assertThat(
            Solution()
                .mincostTickets(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31), intArrayOf(2, 7, 15)),
            equalTo(17)
        )
    }
}
