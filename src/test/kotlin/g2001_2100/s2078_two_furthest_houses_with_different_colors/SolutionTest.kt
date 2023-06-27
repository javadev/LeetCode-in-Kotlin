package g2001_2100.s2078_two_furthest_houses_with_different_colors

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxDistance() {
        assertThat(Solution().maxDistance(intArrayOf(1, 1, 1, 6, 1, 1, 1)), equalTo(3))
    }

    @Test
    fun maxDistance2() {
        assertThat(Solution().maxDistance(intArrayOf(1, 8, 3, 8, 3)), equalTo(4))
    }

    @Test
    fun maxDistance3() {
        assertThat(Solution().maxDistance(intArrayOf(0, 1)), equalTo(1))
    }
}
