package g0001_0100.s0042_trapping_rain_water

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun trap() {
        assertThat(Solution().trap(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)), equalTo(6))
    }

    @Test
    fun trap2() {
        assertThat(Solution().trap(intArrayOf(4, 2, 0, 3, 2, 5)), equalTo(9))
    }
}
