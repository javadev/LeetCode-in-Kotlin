package g2701_2800.s2731_movement_of_robots

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sumDistance() {
        assertThat(Solution().sumDistance(intArrayOf(-2, 0, 2), "RLL", 3), equalTo(8))
    }

    @Test
    fun sumDistance2() {
        assertThat(Solution().sumDistance(intArrayOf(1, 0), "RL", 2), equalTo(5))
    }
}
