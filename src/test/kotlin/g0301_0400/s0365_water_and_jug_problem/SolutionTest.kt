package g0301_0400.s0365_water_and_jug_problem

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun canMeasureWater() {
        assertThat(Solution().canMeasureWater(3, 5, 4), equalTo(true))
    }

    @Test
    fun canMeasureWater2() {
        assertThat(Solution().canMeasureWater(2, 6, 5), equalTo(false))
    }

    @Test
    fun canMeasureWater3() {
        assertThat(Solution().canMeasureWater(1, 2, 3), equalTo(true))
    }
}
