package g0601_0700.s0650_2_keys_keyboard

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun minSteps() {
        assertThat(Solution().minSteps(3), equalTo(3))
    }

    @Test
    fun minSteps2() {
        assertThat(Solution().minSteps(1), equalTo(0))
    }
}
