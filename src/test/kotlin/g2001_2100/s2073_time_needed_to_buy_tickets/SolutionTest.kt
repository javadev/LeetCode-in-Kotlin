package g2001_2100.s2073_time_needed_to_buy_tickets

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun timeRequiredToBuy() {
        assertThat(Solution().timeRequiredToBuy(intArrayOf(2, 3, 2), 2), equalTo(6))
    }

    @Test
    fun timeRequiredToBuy2() {
        assertThat(Solution().timeRequiredToBuy(intArrayOf(5, 1, 1, 1), 0), equalTo(8))
    }
}
