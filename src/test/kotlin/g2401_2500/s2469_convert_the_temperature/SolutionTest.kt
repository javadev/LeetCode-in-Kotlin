package g2401_2500.s2469_convert_the_temperature

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun convertTemperature() {
        assertThat(
            Solution().convertTemperature(36.50),
            equalTo(doubleArrayOf(309.65000, 97.70000)),
        )
    }

    @Test
    fun convertTemperature2() {
        assertThat(
            Solution().convertTemperature(122.11),
            equalTo(doubleArrayOf(395.26000, 251.79800)),
        )
    }
}
