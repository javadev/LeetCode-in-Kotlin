package g2701_2800.s2787_ways_to_express_an_integer_as_sum_of_powers

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfWays() {
        assertThat(Solution().numberOfWays(10, 2), equalTo(1))
    }

    @Test
    fun numberOfWays2() {
        assertThat(Solution().numberOfWays(4, 1), equalTo(2))
    }
}
