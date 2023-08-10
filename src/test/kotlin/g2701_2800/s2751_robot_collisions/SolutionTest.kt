package g2701_2800.s2751_robot_collisions

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun survivedRobotsHealths() {
        assertThat(
            Solution().survivedRobotsHealths(intArrayOf(5, 4, 3, 2, 1), intArrayOf(2, 17, 9, 15, 10), "RRRRR"),
            equalTo(
                listOf(2, 17, 9, 15, 10)
            )
        )
    }

    @Test
    fun survivedRobotsHealths2() {
        assertThat(
            Solution().survivedRobotsHealths(intArrayOf(3, 5, 2, 6), intArrayOf(10, 10, 15, 12), "RLRL"),
            equalTo(
                listOf(14)
            )
        )
    }

    @Test
    fun survivedRobotsHealths3() {
        assertThat(
            Solution().survivedRobotsHealths(intArrayOf(1, 2, 5, 6), intArrayOf(10, 10, 11, 11), "RLRL"),
            equalTo(
                listOf()
            )
        )
    }
}
