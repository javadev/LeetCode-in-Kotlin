package g0601_0700.s0672_bulb_switcher_ii

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun flipLights() {
        assertThat(Solution().flipLights(1, 1), equalTo(2))
    }

    @Test
    fun flipLights2() {
        assertThat(Solution().flipLights(2, 1), equalTo(3))
    }

    @Test
    fun flipLights3() {
        assertThat(Solution().flipLights(3, 1), equalTo(4))
    }

    @Test
    fun flipLights4() {
        assertThat(Solution().flipLights(1, 0), equalTo(1))
    }

    @Test
    fun flipLights5() {
        assertThat(Solution().flipLights(3, 2), equalTo(7))
    }

    @Test
    fun flipLights6() {
        assertThat(Solution().flipLights(3, 3), equalTo(8))
    }

    @Test
    fun flipLights7() {
        assertThat(Solution().flipLights(4, 4), equalTo(8))
    }
}
