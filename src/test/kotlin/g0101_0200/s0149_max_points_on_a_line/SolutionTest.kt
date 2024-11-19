package g0101_0200.s0149_max_points_on_a_line

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun maxPoints() {
        val input = arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(3, 3))
        assertThat(Solution().maxPoints(input), equalTo(3))
    }

    @Test
    fun maxPoints2() {
        val input = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(3, 2),
            intArrayOf(5, 3),
            intArrayOf(4, 1),
            intArrayOf(2, 3),
            intArrayOf(1, 4),
        )
        assertThat(Solution().maxPoints(input), equalTo(4))
    }
}
