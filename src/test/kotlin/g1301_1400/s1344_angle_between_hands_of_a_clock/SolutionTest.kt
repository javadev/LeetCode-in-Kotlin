package g1301_1400.s1344_angle_between_hands_of_a_clock

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun angleClock() {
        assertThat(Solution().angleClock(12, 30), equalTo(165.0))
    }

    @Test
    fun angleClock2() {
        assertThat(Solution().angleClock(3, 30), equalTo(75.0))
    }

    @Test
    fun angleClock3() {
        assertThat(Solution().angleClock(3, 15), equalTo(7.5))
    }
}
