package g2601_2700.s2681_power_of_heroes

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumOfPower() {
        assertThat(
            Solution().sumOfPower(intArrayOf(2, 1, 4)),
            equalTo(141),
        )
    }

    @Test
    fun sumOfPower2() {
        assertThat(
            Solution().sumOfPower(intArrayOf(1, 1, 1)),
            equalTo(7),
        )
    }
}
