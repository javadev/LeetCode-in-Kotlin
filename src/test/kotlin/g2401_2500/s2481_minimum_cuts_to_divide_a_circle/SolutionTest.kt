package g2401_2500.s2481_minimum_cuts_to_divide_a_circle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numberOfCuts() {
        assertThat(Solution().numberOfCuts(4), equalTo(2))
    }

    @Test
    fun numberOfCuts2() {
        assertThat(Solution().numberOfCuts(3), equalTo(3))
    }
}
