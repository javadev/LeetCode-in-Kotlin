package g0801_0900.s0874_walking_robot_simulation

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun robotSim() {
        assertThat(Solution().robotSim(intArrayOf(4, -1, 3), arrayOf()), equalTo(25))
    }

    @Test
    fun robotSim2() {
        assertThat(
            Solution().robotSim(intArrayOf(4, -1, 4, -2, 4), arrayOf(intArrayOf(2, 4))),
            equalTo(65),
        )
    }

    @Test
    fun robotSim3() {
        assertThat(
            Solution()
                .robotSim(
                    intArrayOf(
                        4, -1, 4, -2, 4, 3, 5, -1, 3, -2, 4, -1, 3, -1, 2, -1, 4, -1, 5,
                        -1, 3, -1, 2,
                    ),
                    arrayOf(intArrayOf(2, 4), intArrayOf(4, 5), intArrayOf(2, 3), intArrayOf(0, 1), intArrayOf(1, 6)),
                ),
            equalTo(202),
        )
    }
}
