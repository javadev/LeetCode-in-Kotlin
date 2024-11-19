package g0401_0500.s0407_trapping_rain_water_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun trapRainWater() {
        assertThat(
            Solution()
                .trapRainWater(
                    arrayOf(
                        intArrayOf(1, 4, 3, 1, 3, 2),
                        intArrayOf(3, 2, 1, 3, 2, 4),
                        intArrayOf(2, 3, 3, 2, 3, 1),
                    ),
                ),
            equalTo(4),
        )
    }

    @Test
    fun trapRainWater2() {
        assertThat(
            Solution()
                .trapRainWater(
                    arrayOf(
                        intArrayOf(3, 3, 3, 3, 3),
                        intArrayOf(3, 2, 2, 2, 3),
                        intArrayOf(3, 2, 1, 2, 3),
                        intArrayOf(3, 2, 2, 2, 3),
                        intArrayOf(3, 3, 3, 3, 3),
                    ),
                ),
            equalTo(10),
        )
    }
}
