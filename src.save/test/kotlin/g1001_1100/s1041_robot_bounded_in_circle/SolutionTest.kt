package g1001_1100.s1041_robot_bounded_in_circle

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun isRobotBounded() {
        assertThat(Solution().isRobotBounded("GGLLGG"), equalTo(true))
    }

    @Test
    fun isRobotBounded2() {
        assertThat(Solution().isRobotBounded("GG"), equalTo(false))
    }

    @Test
    fun isRobotBounded3() {
        assertThat(Solution().isRobotBounded("GL"), equalTo(true))
    }
}
