package g2301_2400.s2400_number_of_ways_to_reach_a_position_after_exactly_k_steps

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfWays() {
        assertThat(Solution().numberOfWays(1, 2, 3), equalTo(3))
    }

    @Test
    fun numberOfWays2() {
        assertThat(Solution().numberOfWays(2, 5, 10), equalTo(0))
    }

    @Test
    fun numberOfWays3() {
        assertThat(Solution().numberOfWays(1, 10, 3), equalTo(0))
    }

    @Test
    fun numberOfWays4() {
        assertThat(Solution().numberOfWays(1, 1000, 999), equalTo(1))
    }

    @Test
    fun numberOfWays5() {
        assertThat(Solution().numberOfWays(272, 270, 6), equalTo(15))
    }
}
