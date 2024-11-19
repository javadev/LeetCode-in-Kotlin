package g0901_1000.s0962_maximum_width_ramp

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxWidthRamp() {
        assertThat(Solution().maxWidthRamp(intArrayOf(6, 0, 8, 2, 1, 5)), equalTo(4))
    }

    @Test
    fun maxWidthRamp2() {
        assertThat(
            Solution().maxWidthRamp(intArrayOf(9, 8, 1, 0, 1, 9, 4, 0, 4, 1)),
            equalTo(7),
        )
    }
}
