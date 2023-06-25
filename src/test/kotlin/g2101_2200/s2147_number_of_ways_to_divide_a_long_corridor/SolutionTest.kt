package g2101_2200.s2147_number_of_ways_to_divide_a_long_corridor

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfWays() {
        assertThat(Solution().numberOfWays("SSPPSPS"), equalTo(3))
    }

    @Test
    fun numberOfWays2() {
        assertThat(Solution().numberOfWays("PPSPSP"), equalTo(1))
    }

    @Test
    fun numberOfWays3() {
        assertThat(Solution().numberOfWays("S"), equalTo(0))
    }
}
