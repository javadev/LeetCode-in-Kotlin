package g1501_1600.s1518_water_bottles

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numWaterBottles() {
        assertThat(Solution().numWaterBottles(9, 3), equalTo(13))
    }

    @Test
    fun numWaterBottles2() {
        assertThat(Solution().numWaterBottles(15, 4), equalTo(19))
    }
}
