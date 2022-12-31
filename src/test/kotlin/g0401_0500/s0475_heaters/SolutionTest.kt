package g0401_0500.s0475_heaters

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun findRadius() {
        assertThat(Solution().findRadius(intArrayOf(1, 2, 3), intArrayOf(2)), equalTo(1))
    }

    @Test
    fun findRadius2() {
        assertThat(Solution().findRadius(intArrayOf(1, 2, 3, 4), intArrayOf(1, 4)), equalTo(1))
    }

    @Test
    fun findRadius3() {
        assertThat(Solution().findRadius(intArrayOf(1, 5), intArrayOf(2)), equalTo(3))
    }
}
