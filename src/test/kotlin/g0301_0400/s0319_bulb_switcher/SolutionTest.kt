package g0301_0400.s0319_bulb_switcher

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun bulbSwitch() {
        assertThat(Solution().bulbSwitch(1), equalTo(1))
    }

    @Test
    fun bulbSwitch2() {
        assertThat(Solution().bulbSwitch(4), equalTo(2))
    }
}
