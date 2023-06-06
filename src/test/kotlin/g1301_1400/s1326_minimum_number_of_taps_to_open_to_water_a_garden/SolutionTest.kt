package g1301_1400.s1326_minimum_number_of_taps_to_open_to_water_a_garden

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minTaps() {
        assertThat(Solution().minTaps(5, intArrayOf(3, 4, 1, 1, 0, 0)), equalTo(1))
    }

    @Test
    fun minTaps2() {
        assertThat(Solution().minTaps(3, intArrayOf(0, 0, 0, 0)), equalTo(-1))
    }
}
