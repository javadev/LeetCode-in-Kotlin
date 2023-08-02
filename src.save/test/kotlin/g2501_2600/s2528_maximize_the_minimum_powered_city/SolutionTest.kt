package g2501_2600.s2528_maximize_the_minimum_powered_city

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxPower() {
        assertThat(Solution().maxPower(intArrayOf(1, 2, 4, 5, 0), 1, 2), equalTo(5L))
    }

    @Test
    fun maxPower2() {
        assertThat(Solution().maxPower(intArrayOf(4, 4, 4, 4), 0, 3), equalTo(4L))
    }
}
