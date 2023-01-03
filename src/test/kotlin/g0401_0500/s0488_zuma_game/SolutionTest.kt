package g0401_0500.s0488_zuma_game

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findRadius() {
        assertThat(Solution().findMinStep("WRRBBW", "RB"), equalTo(-1))
    }

    @Test
    fun findRadius2() {
        assertThat(Solution().findMinStep("WWRRBBWW", "WRBRW"), equalTo(2))
    }

    @Test
    fun findRadius3() {
        assertThat(Solution().findMinStep("G", "GGGGG"), equalTo(2))
    }
}
