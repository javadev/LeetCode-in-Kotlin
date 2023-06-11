package g1501_1600.s1518_water_bottles

import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun numWaterBottles() {
        MatcherAssert.assertThat(Solution().numWaterBottles(9, 3), CoreMatchers.equalTo(13))
    }

    @Test
    fun numWaterBottles2() {
        MatcherAssert.assertThat(Solution().numWaterBottles(15, 4), CoreMatchers.equalTo(19))
    }
}
